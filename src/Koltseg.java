/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refaktorált: Tiliczki Tibor
 * Group: Szoft II-1-E
 * Date: 2024-02-21
 * Github: https://github.com/tilitihub/ttokcost.git
 * @ kopirájtkriptobájt
 */

 public class Koltseg {
    private double szallitasKoltseg;
    private double uzletKoltseg;
    private double javitasKoltseg;

    public Koltseg(String szallitasKoltseg, String uzletKoltseg, String javitasKoltseg) {
        this.szallitasKoltseg = Double.parseDouble(szallitasKoltseg);
        this.uzletKoltseg = Double.parseDouble(uzletKoltseg);
        this.javitasKoltseg = Double.parseDouble(javitasKoltseg);
    }

    public double getSzallitasKoltseg() {
        return szallitasKoltseg;
    }

    public double getUzletKoltseg() {
        return uzletKoltseg;
    }

    public double getJavitasKoltseg() {
        return javitasKoltseg;
    }
}