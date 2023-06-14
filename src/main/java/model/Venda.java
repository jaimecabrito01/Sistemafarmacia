package model;

public class Venda {
    private int numeroNota;
    private String data, nomeCliente, cnpj;


    public Venda(int numeroNota, String data, String nomeCliente, String cnpj) {
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
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
