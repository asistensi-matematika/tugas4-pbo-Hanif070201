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
public class Persegi extends BangunDatar {

    protected double Sisi;

    public double Luas(double sisi) {
        double luas = sisi * sisi;
        return luas;
    }

    public double Keliling(double sisi) {
        double keliling = 4 * sisi;
        return keliling;
    }

    @Override
    public void view() {
        super.view();
        System.out.println("persegi");
        System.out.println("Luasnya adalah " + Luas(Sisi) + "cm^2");
        System.out.println("Keliling adalah " + Keliling(Sisi) + "cm");
    }
}
