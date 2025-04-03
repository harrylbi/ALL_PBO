package pratikum4.latihan2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ulangi;

        do {
            System.out.print("Masukkan nilai a: ");
            double a = scanner.nextDouble();
            System.out.print("Masukkan nilai b: ");
            double b = scanner.nextDouble();
            System.out.print("Masukkan nilai c: ");
            double c = scanner.nextDouble();

            Hitung persamaan = new Hitung(a, b, c);
            persamaan.hitungAkar();

            System.out.print("Input data lagi? [Y/N]: ");
            ulangi = scanner.next().charAt(0);
        } while (ulangi == 'Y' || ulangi == 'y');

        scanner.close();
    }
}
