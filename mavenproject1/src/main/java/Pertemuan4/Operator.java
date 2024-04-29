/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan4;

/**
 *
 * @author A-22
 */
public class Operator {

    public static void main(String[] args) {
        int angka1 = 10;
        int angka2 = 5;
// Operator aritmatika
        int hasilJumlah = angka1 + angka2; // 15
        int hasilKurang = angka1 - angka2; // 5
        int hasilKali = angka1 * angka2; // 50
        int hasilBagi = angka1 / angka2; // 2
        int hasilSisa = angka1 % angka2; // 0
// Operator perbandingan
        boolean sama = angka1 == angka2; // false
        boolean tidakSama = angka1 != angka2; // true
        boolean kurangDari = angka1 < angka2; // false
        boolean lebihDari = angka1 > angka2; // true
        boolean kurangDariSama = angka1 <= angka2; // false
        boolean lebihDariSama = angka1 >= angka2; // true
// Operator logika
        boolean andHasil = (angka1 > 0) && (angka2 > 0); // true
        boolean orHasil = (angka1 == 0) || (angka2 == 0); // true
        boolean notHasil = !sama; // true
// Operator penugasan
        int total = 0;
        total += angka1; // total = 10
        total -= angka2; // total = 5
        total *= 2; // total = 10
        total /= 3; // total = 3
        total %= 2; // total = 1
// Operator increment dan decrement
        int counter = 0;
        counter++; // counter = 1
        counter--; // counter = 0
// Operator ternary
        int nilaiTerbesar = angka1 > angka2 ? angka1 : angka2; // nilaiTerbesar = 10
        System.out.println("Hasil jumlah: " + hasilJumlah);
        System.out.println("Hasil kurang: " + hasilKurang);
        System.out.println("Hasil kali: " + hasilKali);
        System.out.println("Hasil bagi: " + hasilBagi);
        System.out.println("Hasil sisa: " + hasilSisa);
        System.out.println("Sama: " + sama);
        System.out.println("Tidak sama: " + tidakSama);
        System.out.println("Kurang dari: " + kurangDari);
        System.out.println("Lebih dari: " + lebihDari);
        System.out.println("Kurang dari sama: " + kurangDariSama);
        System.out.println("Lebih dari sama: " + lebihDariSama);
        System.out.println("AND: " + andHasil);
        System.out.println("OR: " + orHasil);
        System.out.println("NOT: " + notHasil);
        System.out.println("Total: " + total);
        System.out.println("Counter: " + counter);
        System.out.println("Nilai terbesar: " + nilaiTerbesar);
    }
}
