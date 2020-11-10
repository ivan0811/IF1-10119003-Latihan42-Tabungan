package com.ivanfaathirza.tabungan;

import java.util.Scanner;

/**
 *
 * @author Ivan
 * NAMA         : Ivan Faathirza
 * KELAS        : IF1
 * NIM          : 10119003
 * Deskripsi Program : program ini untuk menghitung jumlah saldo dengan menggunakan konstruktor
 */

public class IF110119003Latihan42 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("====Program Penarikan Saldo====");
        System.out.print("Masukkan saldo awal : ");
        Tabungan tabungan = new Tabungan(scan.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        int sisaSaldo = tabungan.ambilTabungan(scan.nextInt());
        System.out.println("Saldo Anda Sekarang : "+sisaSaldo);
    }
}
