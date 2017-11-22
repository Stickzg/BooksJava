package com.flowacademy.konyv;

public class Regeny extends Konyv {
    String stilus;
    private static int darabszam = 0;


    public Regeny(String cim, String szerzo, String kiado, int kiadasDatuma, String stilus) {
        super(cim, szerzo, kiado, kiadasDatuma);
        this.stilus = stilus;
        darabszam++;
    }

    public Regeny(String cim, String szerzo, String kiado, int kiadasDatuma) {
        super(cim, szerzo, kiado, kiadasDatuma);
        this.stilus = "ifjúsági";
        darabszam++;
    }

    public String getStilus() {
        return stilus;
    }

    public void setStilus(String stilus) {
        this.stilus = stilus;
    }


    @Override
    public String toString() {
        return super.toString() +
                " Stílus: " + stilus;
    }
}
