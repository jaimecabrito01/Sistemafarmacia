package model;

public class PerfumeList {
    private String nome_comercial;
    private String fabricante;
    private String numero;
    private String tipo;

    public PerfumeList( String fabricante,String nome_comercial, String numero, String tipo) {
        this.nome_comercial = nome_comercial;
        this.fabricante = fabricante;
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getNome_comercial() {
        return nome_comercial;
    }

    public void setNome_comercial(String nome_comercial) {
        this.nome_comercial = nome_comercial;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
