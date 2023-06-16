package controllers;

import model.Produto;
import service.ProdutoService;

import java.util.ArrayList;

public class ControllerVenda {
    private  String mensagem ;
    private ProdutoService produtoService;

    public ControllerVenda() {
       produtoService = new ProdutoService();
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    public ArrayList<Produto> listMedicamentos(){
        ArrayList<Produto> produtos = produtoService.listaMedicamento();
        mensagem = produtoService.getMensagem();
        return produtos;
    }
    public  ArrayList<Produto> listPerfumaria(){
        ArrayList<Produto> produtos = produtoService.listarPerfumaria();
        mensagem = produtoService.getMensagem();
        return produtos;
    }
}
