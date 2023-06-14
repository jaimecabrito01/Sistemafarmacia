package controllers;

import model.Medicamento;
import model.Perfumaria;
import model.Produto;
import service.ProdutoService;

public class ControllerProduto {
    private String mensagem;
    private ProdutoService produtoService;

    public ControllerProduto() {
        produtoService = new ProdutoService();
    }

    public String getMensagem() {
        return mensagem;
    }
    public  boolean insertProduto(int numero,String nome,Double preco,String tipo_embalagem,int quantidade,String cnpj){
        Produto  produto = new Produto(numero,preco,nome,tipo_embalagem,quantidade,cnpj);
        boolean inseriu = produtoService.insertproduto(produto);
        mensagem = produtoService.getMensagem();


        return  false;
    }
    public  boolean insertPerfume(int numero,String tipo){
        Perfumaria perfumaria = new Perfumaria(numero,tipo);
        boolean inseriu = produtoService.insertPerfumaria(perfumaria);
        mensagem = produtoService.getMensagem();


        return  false;
    }
    public  boolean insertMedicamento(int numero,String tarja,String formula){
        Medicamento medicamento = new Medicamento(numero,tarja,formula);
        boolean inseriu  = produtoService.insertMedicamento(medicamento);
        mensagem = produtoService.getMensagem();
        return false;

    }

}
