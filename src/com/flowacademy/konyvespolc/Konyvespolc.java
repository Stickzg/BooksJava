package com.flowacademy.konyvespolc;

import com.flowacademy.konyv.Konyv;
import com.flowacademy.konyv.Regeny;
import com.flowacademy.konyv.Tankonyv;


public class Konyvespolc {

    static int konyvespolcszam = 0;

    private static void polcraTesz(Konyv konyv, Konyv konyvek[]) {
        konyvek[konyvespolcszam]= konyv ;
        konyvespolcszam++;
    }

    private static Konyv konyvDaralo(String type, String[] konyvadat) {
        String cim = konyvadat[0];
        String szerzo = konyvadat[1];
        String kiado = konyvadat[2];
        int kiadasEve = Integer.parseInt(konyvadat[3]);
        if (type.equals("Tankonyv")) {
            if ( konyvadat.length == 4) {
                return new Tankonyv(cim, szerzo, kiado, kiadasEve);
            } else {
                String tantargy = konyvadat[4];
                return new Tankonyv(cim,szerzo, kiado, kiadasEve, tantargy);
            }
        } else if(type.equals("Regeny")){
            if ( konyvadat.length == 4) {
                return new Regeny(cim, szerzo, kiado, kiadasEve);
            } else {
                String stilus = konyvadat[4];
                return new Regeny(cim,szerzo, kiado, kiadasEve, stilus);
            }
        } else {
            return null;
        }
    }


    public static void main(String[] args) {
        int konyvekSzama = args.length/2;
        Konyv[] konyvespolc = new Konyv[konyvekSzama];

        for (int i = 0; i < args.length; i+=2) {
                String[] tankonyvAdat = args[i+1].split(",");
                    polcraTesz(konyvDaralo(args[i] , tankonyvAdat), konyvespolc);
            }

        for (int i=0; i < konyvespolc.length; i++) {
            System.out.println(konyvespolc[i]);
        }
    }
}

