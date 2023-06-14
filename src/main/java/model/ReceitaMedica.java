package model;

public class ReceitaMedica {
    private int crm, numero;
    private String data;

    public ReceitaMedica(int crm, int numero, String data) {
        this.crm = crm;
        this.numero = numero;
        this.data = data;
    }


    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
