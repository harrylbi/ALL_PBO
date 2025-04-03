package pratikum5.Latihan4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayMatrix {
       public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      // Menu pilihan operasi
      System.out.println("Pilih Operasi Matrix:");
      System.out.println("1. Penjumlahan");
      System.out.println("2. Pengurangan");
      System.out.println("3. Perkalian");
      System.out.println("4. Pembagian");
      System.out.print("Masukkan pilihan (1-4): ");
      int choice = scanner.nextInt();

      // Input ukuran matrix
      System.out.print("Masukkan jumlah data: ");
      int size = scanner.nextInt();

      // Deklarasi ArrayList
      ArrayList<Integer> matrix1 = new ArrayList<>();
      ArrayList<Integer> matrix2 = new ArrayList<>();
      ArrayList<Integer> result = new ArrayList<>();

      // Input matrix pertama
      System.out.println("\nMasukkan nilai Matrix 1:");
      for (int i = 0; i < size; i++) {
         System.out.print("Nilai ke-" + (i + 1) + ": ");
         matrix1.add(scanner.nextInt());
      }

      // Input matrix kedua
      System.out.println("\nMasukkan nilai Matrix 2:");
      for (int i = 0; i < size; i++) {
         System.out.print("Nilai ke-" + (i + 1) + ": ");
         matrix2.add(scanner.nextInt());
      }

      // Operasi berdasarkan pilihan
      switch (choice) {
         case 1:
            result = addMatrix(matrix1, matrix2);
            System.out.println("\nHasil Penjumlahan:");
            break;
         case 2:
            result = subtractMatrix(matrix1, matrix2);
            System.out.println("\nHasil Pengurangan:");
            break;
         case 3:
            result = multiplyMatrix(matrix1, matrix2);
            System.out.println("\nHasil Perkalian:");
            break;
         case 4:
            result = divideMatrix(matrix1, matrix2);
            System.out.println("\nHasil Pembagian:");
            break;
         default:
            System.out.println("Pilihan tidak valid!");
            return;
      }

      // Tampilkan hasil
      for (int i = 0; i < size; i++) {
         System.out.println("Index " + i + ": " + result.get(i));
      }

      scanner.close();
   }

   // Method operasi matrix
   // Penjumlahan
   public static ArrayList<Integer> addMatrix(ArrayList<Integer> m1, ArrayList<Integer> m2) {
      ArrayList<Integer> result = new ArrayList<>();
      for (int i = 0; i < m1.size(); i++) {
         result.add(m1.get(i) + m2.get(i));
      }
      return result;
   }

   // Perngurangan
   public static ArrayList<Integer> subtractMatrix(ArrayList<Integer> m1, ArrayList<Integer> m2) {
      ArrayList<Integer> result = new ArrayList<>();
      for (int i = 0; i < m1.size(); i++) {
         result.add(m1.get(i) - m2.get(i));
      }
      return result;
   }

   // Perkalian
   public static ArrayList<Integer> multiplyMatrix(ArrayList<Integer> m1, ArrayList<Integer> m2) {
      ArrayList<Integer> result = new ArrayList<>();
      for (int i = 0; i < m1.size(); i++) {
         result.add(m1.get(i) * m2.get(i));
      }
      return result;
   }

   // Pembagian
   public static ArrayList<Integer> divideMatrix(ArrayList<Integer> m1, ArrayList<Integer> m2) {
      ArrayList<Integer> result = new ArrayList<>();
      for (int i = 0; i < m1.size(); i++) {
         if (m2.get(i) == 0) {
            System.out.println("Peringatan: Pembagian dengan nol pada index " + i);
            result.add(0);
         } else {
            result.add(m1.get(i) / m2.get(i));
         }
      }
      return result;
   }
}
