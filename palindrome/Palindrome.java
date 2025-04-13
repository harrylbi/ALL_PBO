package palindrome;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        TextGame game = new TextGame();
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan kata: ");
        String input = scanner.nextLine();

        // Menampilkan hasil
        game.displayResult(input);

        // Menutup scanner
        scanner.close();
    }
}
