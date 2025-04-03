package pratikum4.latihan3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ulangi;

        do {
            System.out.print("Masukkan jumlah detik: ");
            int detik = scanner.nextInt();

            Konversi konversi = new Konversi(detik);
            konversi.hitungKonversi();

            System.out.print("Ingin input lagi? [Y/T]: ");
            ulangi = scanner.next().charAt(0);
        } while (ulangi == 'Y' || ulangi == 'y');

        scanner.close();
    }
}
