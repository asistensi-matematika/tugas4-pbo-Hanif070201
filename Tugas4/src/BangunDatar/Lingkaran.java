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
public class Lingkaran extends BangunDatar {

    protected double jari_jari;

    public double Luas(double jari_jari) {
        double luas = 3.14 * jari_jari * jari_jari;
        return luas;
    }

    public double Keliling(double jari_jari) {
        double keliling = 2 * 3.14 * jari_jari;
        return keliling;
    }

    @Override
    public void view() {
        super.view();
        System.out.println("lingkaran");
        System.out.println("luas lingkaran adalah " + Luas(jari_jari));
        System.out.println("keliling lingkaran adalah " + Keliling(jari_jari));

    }
}
