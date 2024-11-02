package Tugas_Latihan;
/**
 *
 * @author user
 * NAMA     : Afsani Wahyu Mawardi
 * KELAS    : TI RegPagi
 * NIM      : 23215058
 * Dekskipsi 
 * Progam   : Progam ini untuk menampilkan For, If
 *         Nilai Terbesar dan Trekecil
 */
import java.util.Scanner;

public class Latihan_23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");

        // Meminta nama petugas
        System.out.print("Masukkan Nama Petugas : ");
        String petugas = scanner.nextLine();

        // Meminta jumlah nilai mahasiswa yang akan dimasukkan
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        int[] nilai = new int[jumlahMahasiswa];

        // Memasukkan nilai setiap mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " = ");
            nilai[i] = scanner.nextInt();
        }

        System.out.println("");
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        // Menampilkan setiap nilai mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " = " + nilai[i]);
        }

        // Menentukan nilai terbesar dan terkecil
        int nilaiTerbesar = nilai[0];
        int nilaiTerkecil = nilai[0];

        for (int i = 1; i < jumlahMahasiswa; i++) {
            if (nilai[i] > nilaiTerbesar) {
                nilaiTerbesar = nilai[i];
            }
            if (nilai[i] < nilaiTerkecil) {
                nilaiTerkecil = nilai[i];
            }
        }

        // Menampilkan hasil nilai terbesar dan terkecil
        System.out.println("");
        System.out.println("Nilai Terbesar adalah " + nilaiTerbesar);
        System.out.println("Nilai Terkecil adalah " + nilaiTerkecil);
        System.out.println("");
        System.out.println("Nama Petugas : " + petugas);

        scanner.close();
    }
}