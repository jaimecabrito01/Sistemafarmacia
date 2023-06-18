package controllers;

import model.*;
import service.ProdutoService;

import java.util.ArrayList;

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
    public ArrayList<MedicamentoList> consultarMedicamentos(){
        ArrayList<MedicamentoList> medicamentos = produtoService.consultarMedicamentos();
        mensagem = produtoService.getMensagem();
        return  medicamentos;
    }
    public  ArrayList<MedicamentoList> listarMed(String nome,String fab,String tarja){
        ArrayList<MedicamentoList> result = produtoService.consultaMedicamento(nome,fab,tarja);
        mensagem = produtoService.getMensagem();
        return  result;
    }
    public  ArrayList<PerfumeList> consultarPerfume(String fab,String nome,String num,String tipo){
        ArrayList<PerfumeList>  result = produtoService.consultaPerfume(fab,nome,num,tipo);
        mensagem = produtoService.getMensagem();
        return  result;
    }
    public  ArrayList<PerfumeList> listarPerfumes(){
        ArrayList<PerfumeList>  result = produtoService.listPerfum();
        mensagem = produtoService.getMensagem();
        return  result;
    }

}
