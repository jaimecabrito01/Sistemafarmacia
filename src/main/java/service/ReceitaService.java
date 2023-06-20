package service;

import data.ConexaoBanco;
import model.Fabricante;
import model.ReceitaMedica;

import java.sql.*;
import java.util.ArrayList;

public class ReceitaService {
    private String mensagem;
    private ConexaoBanco conexaoBanco;

    public ReceitaService(){
       conexaoBanco = ConexaoBanco.getConexaoBanco();
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    public  boolean insertReceitaMedica(ReceitaMedica receitaMedica){
        if(conexaoBanco.isConectado()){
            try {
                Connection connection = conexaoBanco.getConnection();
                String sql = "insert into receita_medica (Numero,CRM,Data) ";
                sql += " values ";
                sql+= " (?,?,?) ;";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1,receitaMedica.getNumero());
                preparedStatement.setInt( 2,receitaMedica.getCrm());
                preparedStatement.setDate(3, new java.sql.Date(receitaMedica.getData().getTime()));
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


    }





