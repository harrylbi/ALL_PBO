package palindrome;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        TextGame game = new TextGame();
        Scanner scanner = new Scanner(System.in);

        char isLanjut;
        boolean lanjut;

        do {
            // Meminta input dari pengguna
            System.out.print("Masukkan kata: ");
            String input = scanner.nextLine();
            // Menampilkan hasil
            game.displayResult(input);

            // Menanyakan apakah ingin lanjut
            System.out.print("Apakah ingin lanjut (Y/N)? ");
            isLanjut = scanner.nextLine().charAt(0);

            if (isLanjut == 'Y' || isLanjut == 'y') {
                lanjut = true;
            } else {
                lanjut = false;
            }

        } while (lanjut);

        // Menutup scanner
        scanner.close();
    }
}
