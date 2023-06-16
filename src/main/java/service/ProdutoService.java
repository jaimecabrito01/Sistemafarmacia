package service;

import data.ConexaoBanco;
import model.Fabricante;
import model.Medicamento;
import model.Perfumaria;
import model.Produto;

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
                String sql = "select  Nome_comercial, p.numero, p.quantidade from produto p,medicamento m where p.numero = m.numero;";
                Statement Statement = connection.createStatement();
                ResultSet resultSet = Statement.executeQuery(sql);
                ArrayList<Produto> produtos = new ArrayList<>();
                while(resultSet.next()){
                    String nome_comercial = resultSet.getString("Nome_comercial");
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

    public String getMensagem() {
        return mensagem;
    }
}
