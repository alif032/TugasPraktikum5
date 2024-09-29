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

public class PenilaianMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input Data Mahasiswa
        System.out.print("NPM : ");
        String npm = input.nextLine();
        System.out.print("Nama Mahasiswa : ");
        String nama = input.nextLine();
        System.out.print("Nilai Kehadiran : ");
        double nilaiKehadiran = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Nilai UTS : ");
        double nilaiUTS = input.nextDouble();
        System.out.print("Nilai UAS : ");
        double nilaiUAS = input.nextDouble();

        // Hitung nilai akhir sesuai bobot
        double nilaiAkhir = (0.10 * nilaiKehadiran) + (0.20 * nilaiTugas) + (0.30 * nilaiUTS) + (0.40 * nilaiUAS);

        // Menentukan Grade dan Keterangan berdasarkan nilai akhir
        char grade;
        String keterangan;

        // Memastikan rentang yang lebih akurat untuk nilai
        if (nilaiAkhir >= 76 && nilaiAkhir <= 100) {
            grade = 'A';
            keterangan = "ISTIMEWA";
        } else if (nilaiAkhir >= 66 && nilaiAkhir < 76) { // 66 <= nilai < 76
            grade = 'B';
            keterangan = "BAIK";
        } else if (nilaiAkhir >= 56 && nilaiAkhir < 66) { // 56 <= nilai < 66
            grade = 'C';
            keterangan = "CUKUP";
        } else if (nilaiAkhir >= 46 && nilaiAkhir < 56) { // 46 <= nilai < 56
            grade = 'D';
            keterangan = "KURANG";
        } else { // nilai < 46
            grade = 'E';
            keterangan = "KURANG SEKALI";
        }

        // Tampilan Output
        System.out.println("\n--- Hasil Penilaian ---");
        System.out.println("NPM Mahasiswa : " + npm);
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Grade : " + grade);
        System.out.println("Keterangan : " + keterangan);
    }
}
