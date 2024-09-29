/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author LENOVO LOQ
 */

import java.util.Scanner;

public class IndeksMassaTubuh {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input berat badan dan tinggi badan dari user
        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = input.nextDouble();
        System.out.print("Masukkan tinggi badan (m): ");
        double tinggiBadan = input.nextDouble();

        // Menghitung IMT
        double imt = beratBadan / (tinggiBadan * tinggiBadan);

        // Menentukan kriteria berdasarkan nilai IMT
        String kriteria;
        if (imt <= 18.4) {
            kriteria = "Berat Badan Kurang";
        } else if (imt >= 18.5 && imt <= 24.9) {
            kriteria = "Berat Badan Ideal";
        } else if (imt >= 25 && imt <= 29.9) {
            kriteria = "Berat Badan Lebih";
        } else if (imt >= 30 && imt <= 39.9) {
            kriteria = "Gemuk";
        } else {
            kriteria = "Sangat Gemuk";
        }

        // Output hasil
        System.out.println("\n--- Hasil Pengukuran ---");
        System.out.println("Nilai IMT : " + imt);
        System.out.println("Kriteria : " + kriteria);
    }  
}
