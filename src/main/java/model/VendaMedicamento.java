package model;

public class VendaMedicamento {
    private int Numero_produto;
    private int numero_nota;
    private int Numero_receita;
    private double imposto;
    private int quantidade;

    public VendaMedicamento(int numero_produto, int numero_nota, int numero_receita, double imposto, int quantidade) {
        Numero_produto = numero_produto;
        this.numero_nota = numero_nota;
        Numero_receita = numero_receita;
        this.imposto = imposto;
        this.quantidade = quantidade;
    }

    public int getNumero_produto() {
        return Numero_produto;
    }

    public void setNumero_produto(int numero_produto) {
        Numero_produto = numero_produto;
    }

    public int getNumero_nota() {
        return numero_nota;
    }

    public void setNumero_nota(int numero_nota) {
        this.numero_nota = numero_nota;
    }

    public int getNumero_receita() {
        return Numero_receita;
    }

    public void setNumero_receita(int numero_receita) {
        Numero_receita = numero_receita;
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
