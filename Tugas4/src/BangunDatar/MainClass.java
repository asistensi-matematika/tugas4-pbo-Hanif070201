/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangunDatar;

import java.util.Scanner;

/**
 *
 * @author OWNER
 */
public class MainClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih bangun datar yang diinginkan\n1. Persegi\n2. Lingkaran\n3. Segitiga");
        System.out.print("Masukkan pilihan Anda : ");
        int pilih = input.nextInt();
        switch (pilih) {
            case 1:
                Persegi p = new Persegi();
                System.out.print("Masukkan panjang sisi : ");
                p.Sisi = input.nextDouble();
                p.view();
                break;
            case 2:
                Lingkaran l = new Lingkaran();
                System.out.print("Masukkan panjang jari-jari : ");
                l.jari_jari = input.nextDouble();
                l.view();
                break;
            case 3:
                JenisSegitiga s = new JenisSegitiga();
                System.out.println("Pilih segitiga yang diinginkan\n1. Segitiga siku-siku\n2. Segitiga sama sisi");
                System.out.print("Masukkan pilihan Anda : ");
                int pilihSegitiga = input.nextInt();
                System.out.print("Masukkan panjang alas : ");
                s.Alas = input.nextDouble();
                System.out.print("Masukkan panjang tinggi : ");
                s.Tinggi = input.nextDouble();
                s.view();
                switch (pilihSegitiga) {
                    case 1:
                        s.view(s.Alas, s.Tinggi);
                        break;
                    case 2:
                        s.view(s.Alas);
                        break;
                    default:
                        System.out.println("Tidak ada dalam pilihan");
                        break;
                }
                break;
            default:
                System.out.println("Tidak ada dalam pilihan");
                break;
        }
    }
}
