package com.flowacademy.konyv;

public class Tankonyv extends Konyv {

    protected String tantargy;

    public Tankonyv(String cim, String szerzo, String kiado, int kiadasDatuma, String tantargy) {
        super(cim, szerzo, kiado, kiadasDatuma);
        this.tantargy = tantargy;
    }

    public Tankonyv(String cim, String szerzo, String kiado, int kiadasDatuma) {
        super(cim, szerzo, kiado, kiadasDatuma);
        this.tantargy = "Programozás 1";
    }


    public String getTantargy() {
        return tantargy;
    }

    public void setTantargy(String tantargy) {
        this.tantargy = tantargy;
    }

    @Override
    public String toString() {
        return super.toString() +
                " tantárgy: " + tantargy;
    }
}
