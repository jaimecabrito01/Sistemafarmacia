package model;

public class VendaPerfumaria {
    private int numero_produto;
    private int Numero_nota;
    private double imposto;
    private int quantidade;

    public VendaPerfumaria(int numero_produto, int numero_nota, double imposto, int quantidade) {
        this.numero_produto = numero_produto;
        Numero_nota = numero_nota;
        this.imposto = imposto;
        this.quantidade = quantidade;
    }

    public int getNumero_produto() {
        return numero_produto;
    }

    public void setNumero_produto(int numero_produto) {
        this.numero_produto = numero_produto;
    }

    public int getNumero_nota() {
        return Numero_nota;
    }

    public void setNumero_nota(int numero_nota) {
        Numero_nota = numero_nota;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
