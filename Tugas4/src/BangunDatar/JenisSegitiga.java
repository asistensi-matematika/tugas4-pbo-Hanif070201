/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangunDatar;

/**
 *
 * @author OWNER
 */
public class JenisSegitiga extends Segitiga {

    public double SisiMiring(double alas, double tinggi) {
        double sisimiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return sisimiring;
    }

    public double keliling(double alas) {
        double keliling = 3 * alas;
        return keliling;
    }

    public double keliling(double alas, double tinggi) {
        double keliling = alas + tinggi + SisiMiring(alas,tinggi);
        return keliling;
    }

    public void view(double alas) {
        System.out.println("Jenis Segitiga adalah Segitiga Sama Sisi");
        System.out.println("Keliling Segitiga adalah " + keliling(alas));
    }

    public void view(double alas, double tinggi) {
        System.out.println("Jenis Segitiga adalah Segitiga Siku-Siku");
        System.out.println("Keliling Segitiga adalah " + keliling(alas, tinggi));
    }
}
