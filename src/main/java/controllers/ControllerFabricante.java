package controllers;
import model.Fabricante;
import service.FabricanteService;

import java.util.ArrayList;

public class ControllerFabricante {
private String mensagem;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    private FabricanteService fabricanteService;

    public ControllerFabricante() {
       fabricanteService = new FabricanteService();
    }

    public boolean insertFabricante(String cnpj,String nome,String rua,int numero,String bairro){
        Fabricante fabricante = new Fabricante(cnpj,nome,rua,numero,bairro);
        boolean inseriu = fabricanteService.inserirFabricante(fabricante);
        mensagem = fabricanteService.getMensagem();
        return  false;
    }
    // Listar fabricantes
    public ArrayList<Fabricante> consultarFabricante(){

        ArrayList<Fabricante> fabricantes = fabricanteService.consultar();
        mensagem = fabricanteService.getMensagem();;

        return fabricantes;

    }
    //Lista
    public  ArrayList<Fabricante> consultarFabricantes(String cnpj,String nome){
        ArrayList<Fabricante>  fabricantes = fabricanteService.consultarFabricantes(cnpj,nome);
        mensagem = fabricanteService.getMensagem();
        return  fabricantes;
    }


}
