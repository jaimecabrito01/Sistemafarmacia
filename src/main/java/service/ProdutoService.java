package service;

import data.ConexaoBanco;
import model.*;


import java.sql.*;
import java.util.ArrayList;

public class ProdutoService {
    private ConexaoBanco conexaoBanco;
    private String mensagem;

    public ProdutoService() {
       conexaoBanco = ConexaoBanco.getConexaoBanco();
    }

    public boolean insertPerfumaria(Perfumaria perfumaria){

        if(conexaoBanco.isConectado()){

            try {
                Connection connection = conexaoBanco.getConnection();
                String sql = "insert into perfumaria (numero,tipo) ";
                sql += " values ";
                sql+= "(?,?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1,perfumaria.getNumero());
                preparedStatement.setString(2, perfumaria.getTipo());
                preparedStatement.executeUpdate();
                mensagem = "Dados inseridos!";
                return  true;
            } catch (SQLException e) {
                mensagem = e.getMessage();

            }
            mensagem = " O banco nao esta conectado";
            return  false;
        }
        return false;
    }
    public  boolean insertproduto(Produto produto){
        if(conexaoBanco.isConectado()){
            try {
                Connection connection = conexaoBanco.getConnection();
                String sql="insert into produto (numero,preco_unitario ,nome_comercial,tipo_embalagem,quantidade,cnpj)";
                sql += " values ";
                sql += "(?,?,?,?,?,?);";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1,produto.getNumero());
                preparedStatement.setDouble(2,produto.getPreco_unitario());
                preparedStatement.setString(3, produto.getNome_comercial());
                preparedStatement.setString(4,produto.getTipo_embalagem());
                preparedStatement.setInt(5,produto.getQuantidade());
                preparedStatement.setString(6,produto.getCnpj());
                preparedStatement.executeUpdate();
                mensagem = "Dados inseridos!";
                return  true;


            } catch (SQLException e) {
                mensagem = e.getMessage();
            }
        }
        mensagem = " O banco nao esta conectado";
        return  false;

    }
    public boolean insertMedicamento(Medicamento medicamento){

        if(conexaoBanco.isConectado()){

            try {
                Connection connection = conexaoBanco.getConnection();
                String sql = "insert into medicamento (numero,tarja,formula) ";
                sql += " values ";
                sql+= "(?,?,?);";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1,medicamento.getNumero());
                preparedStatement.setString(2, medicamento.getTarja());
                preparedStatement.setString(3, medicamento.getFormula());
                preparedStatement.executeUpdate();
                mensagem = "Dados inseridos!";
                return  true;
            } catch (SQLException e) {
                mensagem = e.getMessage();
            }
        }
        mensagem = " O banco nao esta conectado";
        return  false;

    }
    public  ArrayList<Produto> listaMedicamento(){
        if( conexaoBanco.isConectado()){

            try {
                Connection connection = conexaoBanco.getConnection();
                String sql = "select  nome_comercial, p.numero, p.quantidade from produto p,medicamento m where p.numero = m.numero;";
                Statement Statement = connection.createStatement();
                ResultSet resultSet = Statement.executeQuery(sql);
                ArrayList<Produto> produtos = new ArrayList<>();
                while(resultSet.next()){
                    String nome_comercial = resultSet.getString("nome_comercial");
                    int numero = resultSet.getInt("numero");
                    int quantidade = resultSet.getInt("quantidade");
                    Produto produto = new Produto(numero,0,nome_comercial,"",quantidade,"");
                    produtos.add(produto);
                }
               return produtos;
            } catch (SQLException e) {
               mensagem = e.getMessage();
               return  null ;
            }
        }
        mensagem = " Banco não conectado";
        return null;
    }
    public ArrayList<Produto> listarPerfumaria(){
        if(conexaoBanco.isConectado()){

            try {
                Connection connection = conexaoBanco.getConnection();
                String sql = "select  nome_comercial, p.numero, p.quantidade from produto p,perfumaria m where p.numero = m.numero;";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
                ArrayList<Produto> produtos = new ArrayList<>();
                while(resultSet.next()){
                    String nome_comercial = resultSet.getString("nome_comercial");
                    int numero = resultSet.getInt("numero");
                    int quantidade = resultSet.getInt("quantidade");
                    Produto produto = new Produto(numero,0,nome_comercial,"",quantidade,"");
                    produtos.add(produto);

                }
                return produtos;

            } catch (SQLException e) {
                mensagem = e.getMessage();
                return null;
            }

        }
        mensagem = "Banco não conectado";
        return  null;
    }
    public ArrayList<MedicamentoList> consultarMedicamentos(){
        if(conexaoBanco.isConectado()){

            try {
                Connection connection = conexaoBanco.getConnection();
                String sql = "SELECT f.nome, p.nome_comercial, m.tarja FROM fabricante f JOIN produto p ON p.CNPJ = f.CNPJ JOIN medicamento m ON m.numero = p.numero";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
                ArrayList<MedicamentoList> produtos = new ArrayList<>();
                while(resultSet.next()){
                String nome = resultSet.getString("nome");
                String nome_comercial = resultSet.getString("nome_comercial");
                String tarja = resultSet.getString("tarja");
                MedicamentoList medicamentoList = new MedicamentoList(nome,nome_comercial,tarja);
                produtos.add(medicamentoList);
                }
                return produtos;

            } catch (SQLException e) {
                mensagem = e.getMessage();
                return null;
            }

        }
        mensagem = "Banco não conectado";
        return  null;
    }
    public String montarSelect(String nome_comercial, String fabricante, String tarja) {
        StringBuilder sql = new StringBuilder("SELECT f.nome, p.nome_comercial, m.tarja FROM fabricante f JOIN produto p ON p.CNPJ = f.CNPJ JOIN medicamento m ON m.numero = p.numero ");

        boolean where = false;

        if (!tarja.isEmpty()) {
            sql.append(" WHERE m.tarja = '" + tarja + "'");
            where = true;
        }

        if (!fabricante.isEmpty()) {
            sql.append(where ? " AND" : " WHERE");
            sql.append(" f.nome LIKE '%" + fabricante + "%'");
            where = true;
        }

        if (!nome_comercial.isEmpty()) {
            sql.append(where ? " AND" : " WHERE");
            sql.append(" p.nome_comercial LIKE '%" + nome_comercial + "%'");
        }

        return sql.toString();
    }

    public  ArrayList<MedicamentoList>  consultaMedicamento(String nome_comercial,String fabricante,String tarja){
        if(conexaoBanco.isConectado()){

            try {
                Connection connection = conexaoBanco.getConnection();
                Statement statement = connection.createStatement();
                String sql = montarSelect(nome_comercial,fabricante,tarja);
                System.out.println(sql);
                ResultSet resultSet = statement.executeQuery(sql);
                ArrayList<MedicamentoList> produtos = new ArrayList<>();
                while(resultSet.next()){
                    String nome = resultSet.getString("nome");
                    String nome_comercial1 = resultSet.getString("nome_comercial");
                    String tarja1 = resultSet.getString("tarja");
                    MedicamentoList medicamentoList = new MedicamentoList(nome,nome_comercial1,tarja1);
                    produtos.add(medicamentoList);
                }
                return produtos;

            } catch (SQLException e) {
                mensagem = e.getMessage();
                return null;
            }

        }
        mensagem = "Banco não conectado";
        return  null;
    }
    public String montarSelectPerfumaria(String fabricante, String nome_comercial, String numero, String tipo) {
        StringBuilder sql = new StringBuilder("SELECT f.nome, p.nome_comercial, m.numero, m.tipo FROM fabricante f JOIN produto p ON p.CNPJ = f.CNPJ JOIN perfumaria m ON m.numero = p.numero");

        boolean where = false;

        if (!numero.isEmpty()) {
            sql.append(" WHERE m.numero = " + numero);
            where = true;
        }

        if (!fabricante.isEmpty()) {
            sql.append(where ? " AND" : " WHERE");
            sql.append(" f.nome LIKE '%" + fabricante + "%'");
            where = true;
        }

        if (!nome_comercial.isEmpty()) {
            sql.append(where ? " AND" : " WHERE");
            sql.append(" p.nome_comercial LIKE '%" + nome_comercial + "%'");
            where = true;
        }

        if (!tipo.isEmpty()) {
            sql.append(where ? " AND" : " WHERE");
            sql.append(" m.tipo = '" + tipo + "'");
        }

        return sql.toString();
    }

    public  ArrayList<PerfumeList>  consultaPerfume(String fabricante,String nome_comercial,String numero,String tipo){
        if(conexaoBanco.isConectado()){

            try {
                Connection connection = conexaoBanco.getConnection();
                Statement statement = connection.createStatement();
                String sql = montarSelectPerfumaria(fabricante,nome_comercial,numero,tipo);
                System.out.println(sql);
                ResultSet resultSet = statement.executeQuery(sql);
                ArrayList<PerfumeList> produtos = new ArrayList<>();
                while(resultSet.next()){
                    String fabricante1 = resultSet.getString("nome");
                    String nome_comercial1 = resultSet.getString("nome_comercial");
                    int num = resultSet.getInt("numero");
                    String tipo1 = resultSet.getString("tipo");
                    PerfumeList perfumeList = new PerfumeList(fabricante1,nome_comercial1,String.valueOf(num),tipo);
                    produtos.add(perfumeList);
                }
                return produtos;

            } catch (SQLException e) {
                mensagem = e.getMessage();
                return null;
            }

        }
        mensagem = "Banco não conectado";
        return  null;
    }
    public  ArrayList<PerfumeList>  listPerfum(){
        if(conexaoBanco.isConectado()){

            try {
                Connection connection = conexaoBanco.getConnection();
                Statement statement = connection.createStatement();
                String sql = "SELECT f.nome, p.nome_comercial,m.numero,m.tipo FROM fabricante f JOIN produto p ON p.CNPJ = f.CNPJ JOIN perfumaria m ON m.numero = p.numero;";

                ResultSet resultSet = statement.executeQuery(sql);
                ArrayList<PerfumeList> produtos = new ArrayList<>();
                while(resultSet.next()){
                    String fabricante1 = resultSet.getString("nome");
                    String nome_comercial1 = resultSet.getString("nome_comercial");
                    int num = resultSet.getInt("numero");
                    String tipo1 = resultSet.getString("tipo");
                    PerfumeList perfumeList = new PerfumeList(fabricante1,nome_comercial1,String.valueOf(num),tipo1);
                    produtos.add(perfumeList);
                }
                return produtos;

            } catch (SQLException e) {
                mensagem = e.getMessage();
                return null;
            }

        }
        mensagem = "Banco não conectado";
        return  null;
    }



    public String getMensagem() {
        return mensagem;
    }
}
