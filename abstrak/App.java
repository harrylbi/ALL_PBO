package abstrak;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mobil mobilku = new Mobil();
        Truk trukku = new Truk();

        System.out.println(" MENU PILIH KENDARAAN ");
        System.out.println("1. Mobil");
        System.out.println("2. Truk");
        System.out.println("3. Keluar");
        System.out.print("Pilih jenis kendaraan (1/2): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); 

        if (pilihan == 1) {
            System.out.print("Masukkan merk mobil: ");
            String merk = scanner.nextLine();
            System.out.print("Masukkan model mobil: ");
            String model = scanner.nextLine();
            mobilku.setMerk(merk);
            mobilku.setModel(model);
            mobilku.setJumlahRoda(4);

            System.out.println("\n Data Mobil ");
            System.out.println("Merk: " + mobilku.getMerk());
            System.out.println("Model: " + mobilku.getModel());
            System.out.println("Jumlah Roda: " + mobilku.getJumlahRoda());
        } else if (pilihan == 2) {
            System.out.print("Masukkan merk truk: ");
            String merk = scanner.nextLine();
            System.out.print("Masukkan model truk: ");
            String model = scanner.nextLine();
            trukku.setMerk(merk);
            trukku.setModel(model);
            trukku.setJumlahRoda(6);

            System.out.println("\n Data Truk ");
            System.out.println("Merk: " + trukku.getMerk());
            System.out.println("Model: " + trukku.getModel());
            System.out.println("Jumlah Roda: " + trukku.getJumlahRoda());
        } else if (pilihan == 3) {
            System.out.println("Terima kasih telah menggunakan layanan bank kami.");
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}