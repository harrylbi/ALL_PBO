package pratikum4;

import java.util.Scanner;

public class OutputNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            System.out.print("\nMasukkan nilai tugas: ");
            float tugas = input.nextFloat();
            
            System.out.print("Masukkan nilai UTS: ");
            float uts = input.nextFloat();
            
            System.out.print("Masukkan nilai UAS: ");
            float uas = input.nextFloat();

            // Membuat objek Nilai dan mencetak hasil
            Nilai nilai = new Nilai();
            nilai.cetakNilai(tugas, uts, uas);
            
            // Konfirmasi apakah ingin input lagi
            System.out.print("\nApakah ingin menginput lagi? (y/n): ");
            String jawab = input.next();
            lanjut = jawab.equalsIgnoreCase("y");
        }
        
        input.close();
    }
}
