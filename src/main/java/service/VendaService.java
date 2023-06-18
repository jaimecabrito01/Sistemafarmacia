package service;

import data.ConexaoBanco;
import model.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VendaService {
    private ConexaoBanco conexaoBanco;
    private  String mensagem;

    public VendaService() {
        conexaoBanco = ConexaoBanco.getConexaoBanco();
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    public boolean insertVenda(Venda venda){
        if(conexaoBanco.isConectado()){

            try {
                Connection connection = conexaoBanco.getConnection();
                String sql = "insert into venda (numero_nota,data,Nome_cliente) ";
                sql+= " values ";
                sql+="(?,?,?) ;";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1,venda.getNumeroNota());
                preparedStatement.setDate(2,new java.sql.Date(venda.getData().getTime()));
                preparedStatement.setString(3,venda.getNomeCliente());
                preparedStatement.executeUpdate();
                mensagem = "Dados inseridos!";
                return  true;
            } catch (SQLException e) {
                mensagem = e.getMessage();
                return  false;
            }
        }
        mensagem = " O banco nao esta conectado";
        return  false;
    }
    public boolean insertVendaMedicamento(VendaMedicamento vendaMedicamento){
        if(conexaoBanco.isConectado()){

            try {
                Connection connection = conexaoBanco.getConnection();
                String sql = "insert into vendamedicamento (numero_produto,numero_venda,numero_receita,quantidade,imposto) ";
                sql+= " values ";
                sql+="(?,?,?,?,?) ;";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1,vendaMedicamento.getNumero_produto());
                preparedStatement.setInt(2,vendaMedicamento.getNumero_nota());
                preparedStatement.setInt(3,vendaMedicamento.getNumero_receita());
                preparedStatement.setInt(4,vendaMedicamento.getQuantidade());
                preparedStatement.setDouble(5,vendaMedicamento.getImposto());
                preparedStatement.executeUpdate();
                mensagem = "Dados inseridos!";
                return  true;
            } catch (SQLException e) {
                mensagem = e.getMessage();
                return  false;
            }
        }
        mensagem = " O banco nao esta conectado";
        return  false;
    }
    public boolean insertVendaPerfumaria(VendaPerfumaria vendaPerfumaria){
        if(conexaoBanco.isConectado()){

            try {
                Connection connection = conexaoBanco.getConnection();
                String sql = "insert into vendaperfumaria (numero_produto,numero_nota,imposto,quantidade) ";
                sql+= " values ";
                sql+="(?,?,?,?) ;";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1,vendaPerfumaria.getNumero_produto());
                preparedStatement.setInt(2,vendaPerfumaria.getNumero_nota());
                preparedStatement.setDouble(3,vendaPerfumaria.getImposto());
                preparedStatement.setInt(4,vendaPerfumaria.getQuantidade());

                preparedStatement.executeUpdate();
                mensagem = "Dados inseridos!";
                return  true;
            } catch (SQLException e) {
                mensagem = e.getMessage();
                return  false;
            }
        }
        mensagem = " O banco nao esta conectado";
        return  false;
    }


}


