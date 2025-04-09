import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        // Membuat scanner untuk input
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan kata: ");
        String input = scanner.nextLine();

        // Memanggil metode untuk mengecek palindrome
        if (isPalindrome(input)) {
            System.out.println("Hasil: Palindrome");
        } else {
            System.out.println("Hasil: Bukan Palindrome");
        }

        // Menutup scanner
        scanner.close();
    }

    // Metode untuk mengecek apakah sebuah string palindrome
    public static boolean isPalindrome(String text) {
        String cleanedText = text.replaceAll("\\s+", "").toLowerCase(); // Menghilangkan spasi dan mengubah ke huruf kecil
        String reversedText = new StringBuilder(cleanedText).reverse().toString();
        return cleanedText.equals(reversedText);
    }
}
