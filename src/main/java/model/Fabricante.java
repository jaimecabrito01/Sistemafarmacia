package model;

public class Fabricante {
private String cnpj;
private String Nome;

private String rua;

private int numero;

private String bairro;




    public Fabricante(String cnpj, String nome, String rua, int numero,String bairro) {
        this.cnpj = cnpj;
        Nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.bairro =bairro;

    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }



    @Override
    public String toString() {
        return Nome; // Ou qualquer outra informação relevante que você deseje exibir
    }







}
