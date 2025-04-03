package week3;
import java.util.Scanner;

public class Inputan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = s.nextLine();
        User user = new User(nama);

        System.out.print("Masukkan angka: ");
        int angka = s.nextInt();
        if (angka % 2 == 0)   {
            System.out.println("Angka " + angka + " adalah genap");
        }


        System.out.println("\nHalo, " + user.getNama() + "!");
        bil.cekBilangan();

        s.close();
    }
}