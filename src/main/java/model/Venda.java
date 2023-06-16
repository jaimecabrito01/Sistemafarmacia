package model;

import java.util.Date;

public class Venda {
    private int numeroNota;
    private String nomeCliente, cnpj;
    private Date data;



    public Venda(int numeroNota, Date data, String nomeCliente, String cnpj) {
        this.numeroNota = numeroNota;
        this.data = data;
        this.nomeCliente = nomeCliente;
        this.cnpj = cnpj;
    }


    public int getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(int numeroNota) {
        this.numeroNota = numeroNota;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
