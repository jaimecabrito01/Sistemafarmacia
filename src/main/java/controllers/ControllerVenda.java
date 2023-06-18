package controllers;

import model.*;
import service.ProdutoService;
import service.ReceitaService;
import service.VendaService;

import java.util.ArrayList;
import java.util.Date;

public class ControllerVenda {
    private  String mensagem ;
    private ProdutoService produtoService;
    private VendaService vendaService;
    private ReceitaService receitaMedica;

    public ControllerVenda() {
       produtoService = new ProdutoService();
       vendaService = new VendaService();
       receitaMedica = new ReceitaService();

    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public  boolean insertVenda(int numero_nota, Date data,String nome_cliente){
        Venda venda = new Venda(numero_nota,data,nome_cliente);
        boolean inseriu = vendaService.insertVenda(venda);
        mensagem = vendaService.getMensagem();
        return false;
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
    public boolean insertVendaMedicamento(int numero,int numero_venda,int numero_rceita,int quantidade,double imposto){
        VendaMedicamento vendaMedicamento = new VendaMedicamento(numero,numero_venda,numero_rceita,imposto,quantidade);

        boolean inseriu = vendaService.insertVendaMedicamento(vendaMedicamento);
        mensagem = vendaService.getMensagem();
        return  false;
    }
    public  boolean insertVendaPerfumaria(int numero,int numero_nota,double imposto,int quantidade){
        VendaPerfumaria vendaPerfumaria = new VendaPerfumaria(numero,numero_nota,imposto,quantidade);
        boolean inseriu = vendaService.insertVendaPerfumaria(vendaPerfumaria);
        mensagem = vendaService.getMensagem();
        return  false;
    }

    public  boolean insertReceita(int numero,int crm,Date data){
        System.out.println(data);
        System.out.println(numero);
        System.out.println(crm);
        ReceitaMedica receitaMedica1 = new ReceitaMedica(numero,crm,data);
        boolean inseriu = receitaMedica.insertReceitaMedica(receitaMedica1);
        mensagem = receitaMedica.getMensagem();
        return  false;
    }
}
