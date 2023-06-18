package model;

public class MedicamentoList {
    private String nome_comercial;
    private String fabricante;
    private String tarja;

    public MedicamentoList(String fabricante,String nome_comercial, String tarja) {
        this.nome_comercial = nome_comercial;
        this.fabricante = fabricante;
        this.tarja = tarja;
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

    public String getTarja() {
        return tarja;
    }

    public void setTarja(String tarja) {
        this.tarja = tarja;
    }
}
