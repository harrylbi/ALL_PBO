package latihanDewe.latihan1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Penjualan penjualan1 = new Penjualan();
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            System.out.println("Input kode barang:");
            String kode = input.next();

            System.out.println("Input nama barang:");
            String nama = input.next();
            System.out.println("Input harga barang:");
            float harga = input.nextFloat();
            System.out.println("Input jumlah barang:");
            int jumlah = input.nextInt();

            penjualan1.setData(kode, nama, harga, jumlah);
            penjualan1.cetakNota();

            System.out.println("Apakah ingin melanjutkan? (y/n)");
            String jawab = input.next();
            if (jawab.equalsIgnoreCase("n")) {
                lanjut = false;
            }
        }
    }
}