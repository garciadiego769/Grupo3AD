package com.grupo3.DAL;

public class Datos {
    private String nombreCC;
    private String tipoBDD;

    public Datos(String nombreCC, String tipoBDD) {
        this.nombreCC = nombreCC;
        this.tipoBDD = tipoBDD;
    }

    public String getNombreCC() {
        return nombreCC;
    }

    public void setNombreCC(String nombreCC) {
        this.nombreCC = nombreCC;
    }

    public String getTipoBDD() {
        return tipoBDD;
    }

    public void setTipoBDD(String tipoBDD) {
        this.tipoBDD = tipoBDD;
    }
}
