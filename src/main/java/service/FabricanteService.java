package service;


import data.ConexaoBanco;
import model.Fabricante;

import java.sql.*;
import java.util.ArrayList;

public class FabricanteService {
    private ConexaoBanco conexaoBanco;
    private String mensagem;

    public FabricanteService(){
        conexaoBanco = ConexaoBanco.getConexaoBanco();
    }
    public boolean inserirFabricante(Fabricante fabricante){
        if(conexaoBanco.isConectado()){
            try{
                Connection connection = conexaoBanco.getConnection();
                String sql="insert into fabricante (cnpj,nome,rua,numero,bairro) ";
                sql += " values ";
                sql += "(?,?,?,?,?);";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1,fabricante.getCnpj());
                preparedStatement.setString(2,fabricante.getNome());
                preparedStatement.setString(3,fabricante.getRua());
                preparedStatement.setInt(4,fabricante.getNumero());
                preparedStatement.setString(5,fabricante.getBairro());
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
    public ArrayList<Fabricante> consultar(){
        if(conexaoBanco.isConectado()){

            try {
                Connection connection = conexaoBanco.getConnection();
                String sql = "SELECT * from fabricante ;";
               Statement Statement = connection.createStatement();
               ResultSet resultSet = Statement.executeQuery(sql);

               ArrayList<Fabricante> fabricantes = new ArrayList<>();
               while (resultSet.next()){
                   String cnpj =  resultSet.getString("cnpj");
                   String nome = resultSet.getString("nome");
                   String rua = resultSet.getString("rua");
                   int numero = resultSet.getInt("numero");
                   String bairro = resultSet.getString("bairro");
                   Fabricante fabricante = new Fabricante(cnpj,nome,rua,numero,bairro);
                   fabricantes.add(fabricante);
               }
               return fabricantes;
            } catch (SQLException e) {
                mensagem = "Erro ao tentar consultar os ";
                return null;
            }

        }
        mensagem = "O banco não está conectado.";
        return null;
    }

    public String getMensagem(){
        return mensagem;
    }
}
