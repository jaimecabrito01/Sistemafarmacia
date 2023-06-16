package model;

public class Medicamento {
    private int numero;

    private String tarja;

    private String formula;


    public Medicamento(int numero, String tarja, String formula) {
        this.numero = numero;
        this.tarja = tarja;
        this.formula = formula;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTarja() {
        return tarja;
    }

    public void setTarja(String tarja) {
        this.tarja = tarja;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }


}
