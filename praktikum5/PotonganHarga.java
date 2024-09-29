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

public class PotonganHarga {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input total pembelian dari user
        System.out.print("Masukkan total pembelian Rp.: ");
        double totalPembelian = input.nextDouble();

        // Variabel untuk menyimpan besarnya potongan
        double potongan;

        // Menentukan potongan berdasarkan total pembelian
        if (totalPembelian < 50000) {
            potongan = totalPembelian * 0.05; // 5% potongan
        } else {
            potongan = totalPembelian * 0.20; // 20% potongan
        }

        // Menghitung jumlah yang harus dibayarkan
        double totalBayar = totalPembelian - potongan;

        // Output hasil
        System.out.println("\n--- Rincian Pembelian ---");
        System.out.println("Total pembelian Rp.: " + totalPembelian);
        System.out.println("Besarnya potongan Rp.: " + potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp.: " + totalBayar);
    }  
}
