package week8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulangi;
        
        do {
            System.out.println("Masukkan nama bangun datar (a,b,c,d): ");
            System.out.println("a.persegi");
            System.out.println("b.persegi panjang");
            System.out.println("C.segitiga");
            System.out.println("d.lingkaran");
            System.out.println("keluar");


            ulangi = scanner.nextLine().toLowerCase(); // Input nama bangun datar

            switch (ulangi) {
                case "a":
                    System.out.print("Masukkan sisi persegi: ");
                    int sisi = scanner.nextInt();
                    BangunDatar persegi = new BangunDatar("persegi", sisi);
                    System.out.println("Luas persegi: " + persegi.hitungluas());
                    break;
                case "b":
                    System.out.print("Masukkan panjang: ");
                    int panjang = scanner.nextInt();
                    System.out.print("Masukkan lebar: ");
                    int lebar = scanner.nextInt();
                    BangunDatar persegiPanjang = new BangunDatar("persegi panjang", panjang, lebar);
                    System.out.println("Luas persegi panjang: " + persegiPanjang.hitungluas());
                    break;
                case "c":
                    System.out.print("Masukkan alas: ");
                    double alas = scanner.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggi = scanner.nextDouble();
                    BangunDatar segitiga = new BangunDatar("segitiga", alas, tinggi);
                    System.out.println("Luas segitiga: " + segitiga.hitungluas());
                    break;
                case "d":
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    double jarijari = scanner.nextDouble();
                    BangunDatar lingkaran = new BangunDatar("lingkaran", jarijari);
                    System.out.println("Luas lingkaran: " + lingkaran.hitungluas());
                    break;
                case "keluar":
                    close
                default:
                    System.out.println("Bangun datar tidak dikenali.");
                    break;
            }

            scanner.nextLine(); // Membersihkan newline karakter setelah input angka
            System.out.print("Apakah Anda ingin mengulang (ya/tidak)? ");
            ulangi = scanner.nextLine().toLowerCase();
            
        } while (ulangi.equals("ya"));

        scanner.close();
        System.out.println("Terima kasih!");
    }
}
