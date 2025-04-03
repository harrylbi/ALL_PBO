package pratikum4.latihan1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Penjualan penjualan1 = new Penjualan();
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            System.out.print("Masukkan kode barang:");
            String kode = input.next();

            input.nextLine(); // Membersihkan buffer
            System.out.print("Masukkan nama barang:");
            String nama = input.nextLine();

            System.out.print("Masukkan harga barang:");
            int harga = input.nextInt();

            System.out.print("Masukkan jumlah barang:");
            int jumlah = input.nextInt();
            input.nextLine(); // Membersihkan buffer

            penjualan1.setData(kode, nama, harga, jumlah);
            penjualan1.cetakNota();

            System.out.print("Apakah ingin memasukkan data lagi? (y/n)");
            String pilihan = input.nextLine();

            if (pilihan.equalsIgnoreCase("n")) {
                lanjut = false;
            }
        }

        input.close();
    }
}
