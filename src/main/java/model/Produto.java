package model;

public class Produto {
    private int numero;
    private double preco_unitario;
    private String nome_comercial;

    private String tipo_embalagem;
    private int quantidade;
    private String cnpj;

    public Produto(int numero, double preco_unitario, String nome_comercial, String tipo_embalagem, int quantidade, String cnpj) {
        this.numero = numero;
        this.preco_unitario = preco_unitario;
        this.nome_comercial = nome_comercial;
        this.tipo_embalagem = tipo_embalagem;
        this.quantidade = quantidade;
        this.cnpj = cnpj;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(double preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

    public String getNome_comercial() {
        return nome_comercial;
    }

    public void setNome_comercial(String nome_comercial) {
        this.nome_comercial = nome_comercial;
    }

    public String getTipo_embalagem() {
        return tipo_embalagem;
    }

    public void setTipo_embalagem(String tipo_embalagem) {
        this.tipo_embalagem = tipo_embalagem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return nome_comercial;

    }
}
