/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

import java.util.Scanner;

/**
 *
 * @author A-22
 */
public class Input_Demo {

    public static void main(String[] args) {
// Deklarasi variabel
        char huruf;
        boolean isMasihBelajar;
        int nilaiUjian;
        double hargaBarang;
        float diskon;
        byte umur;
        short kodePos;
        long populasiNegara;
// Membuat objek Scanner untuk input data
        Scanner scanner = new Scanner(System.in);
// Input data karakter
        System.out.println("Masukkan huruf: ");
        huruf = scanner.next().charAt(0);
// Input data boolean
        System.out.println("Apakah Anda masih belajar (true/false): ");
        isMasihBelajar = scanner.nextBoolean();
// Input data numerik (int)
        System.out.println("Masukkan nilai ujian (int): ");
        nilaiUjian = scanner.nextInt();
// Input data numerik (double)
        System.out.println("Masukkan harga barang (double): ");
        hargaBarang = scanner.nextDouble();
// Input data numerik (float)
        System.out.println("Masukkan diskon (float): ");
        diskon = scanner.nextFloat();
// Input data numerik (byte)
        System.out.println("Masukkan umur (byte): ");
        umur = scanner.nextByte();
// Input data numerik (short)
        System.out.println("Masukkan kode pos (short): ");
        kodePos = scanner.nextShort();
// Input data numerik (long)
        System.out.println("Masukkan populasi negara (long): ");
        populasiNegara = scanner.nextLong();
// Menampilkan data yang diinput
        System.out.println("\nData yang Anda masukkan:");
        System.out.println("Huruf: " + huruf);
        System.out.println("Masih belajar: " + isMasihBelajar);
        System.out.println("Nilai ujian: " + nilaiUjian);
        System.out.println("Harga barang: " + hargaBarang);
        System.out.println("Diskon: " + diskon);
        System.out.println("Umur: " + umur);
        System.out.println("Kode pos: " + kodePos);
        System.out.println("Populasi negara: " + populasiNegara);
    }
}
