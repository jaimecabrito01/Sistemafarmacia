package model;

import java.util.Date;

public class ReceitaMedica {
    private int crm;
    private  int numero;
    private Date data;

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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public ReceitaMedica(int numero,int crm, Date data) {
        this.crm = crm;
        this.numero = numero;
        this.data = data;
    }


}