package controllers;

import data.ConexaoBanco;

public class ControllerConexao {
    private String mensagem;
    private ConexaoBanco conexaoBanco;

    public ControllerConexao(){
        conexaoBanco = ConexaoBanco.getConexaoBanco();
    }

    public String getMensagem(){
        return mensagem;
    }

    public boolean abrirConexao(String usuario, String senha){
        boolean conectou;
        conectou = conexaoBanco.conectar(usuario,senha);
        mensagem = conexaoBanco.getMensagem();
        return conectou;
    }

    public boolean fecharConexao(){
        boolean fechouConexao;
        fechouConexao = conexaoBanco.desconectar();
        mensagem = conexaoBanco.getMensagem();
        return fechouConexao;
    }
}
