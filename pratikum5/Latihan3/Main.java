package pratikum5.Latihan3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka (pisahkan dengan spasi): ");
        String input = scanner.nextLine();
        String[] strArr = input.split(" ");
        int[] arr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        Sorting sorting = new Sorting();
        // Membuat salinan array untuk setiap algoritma
        int[] bubbleArr = arr.clone();
        int[] quickArr = arr.clone();
        int[] insertionArr = arr.clone();
        int[] selectionArr = arr.clone();
        int[] mergeArr = arr.clone();
        // Menjalankan semua algoritma sorting
        sorting.bubbleSort(bubbleArr);
        System.out.println("\nQuick Sort:");
        sorting.quickSort(quickArr, 0, quickArr.length - 1);
        System.out.println(Arrays.toString(quickArr));
        sorting.insertionSort(insertionArr);
        sorting.selectionSort(selectionArr);
        System.out.println("\nMerge Sort:");
        sorting.mergeSort(mergeArr, 0, mergeArr.length - 1);
        System.out.println(Arrays.toString(mergeArr));

        scanner.close();
    }
}
