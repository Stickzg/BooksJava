package com.flowacademy.konyv;

public class Konyv {
    protected String cim;
    protected String szerzo;
    protected String kiado;
    protected int kiadasDatuma;

    public Konyv(String cim, String szerzo, String kiado, int kiadasDatuma) {
        this.cim = cim;
        this.szerzo = szerzo;
        this.kiado = kiado;
        this.kiadasDatuma = kiadasDatuma;
    }

    public Konyv(){
        this.cim ="Objektumorientált Tervezés és Programozás";
        this.szerzo = "Angster Erzsébet";
        this.kiado = "Kiskapu";
        this.kiadasDatuma = 2001;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public void setSzerzo(String szerzo) {
        this.szerzo = szerzo;
    }

    public String getKiado() {
        return kiado;
    }

    public void setKiado(String kiado) {
        this.kiado = kiado;
    }

    public float getKiadasDatuma() {
        return kiadasDatuma;
    }

    public void setKiadasDatuma(int kiadasDatuma) {
        this.kiadasDatuma = kiadasDatuma;
    }

    @Override
    public String toString() {
        return "Konyv|" +
                "cim='" + cim +
                ", szerzo: " + szerzo +
                ", kiado: " + kiado +
                ", kiadasDatuma: " + kiadasDatuma;
    }
}
