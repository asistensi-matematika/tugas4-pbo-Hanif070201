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
public class Segitiga extends BangunDatar {

    protected double Alas;
    protected double Tinggi;

    public double Luas(double alas, double tinggi) {
        double luas = 0.5 * alas * tinggi;
        return luas;
    }

    @Override
    public void view() {
        super.view();
        System.out.println("segitiga");
        System.out.println("Luas segitiga adalah " + Luas(Alas, Tinggi));
    }
}
