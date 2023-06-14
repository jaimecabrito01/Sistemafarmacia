package model;

public class Perfumaria {

    private int numero;
    private String tipo;


    public Perfumaria(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
