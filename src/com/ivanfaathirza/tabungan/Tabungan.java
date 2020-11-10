package com.ivanfaathirza.tabungan;

public class Tabungan {
    private int saldo;
    public Tabungan(int saldo){
        this.saldo = saldo;
    }

    public int ambilTabungan(int jumlah){
        return saldo - jumlah;
    }
}
