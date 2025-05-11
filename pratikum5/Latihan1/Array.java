package pratikum5.Latihan1;

import java.util.Scanner;

public class Array{
    private int[] nilai;

    public Array(int jumlahData){
        this.nilai = new int[jumlahData];
    }

    public void isiarray(){
        Scanner input = new Scanner(System.in);
        System.out.println("this is nilai array"+ nilai.length);
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("data ke- " + (i+1) + " : ");
            this.nilai[i] = input.nextInt();
        }
        input.close();

    }

    public void menampilkanIsiArray(){
        System.out.println();
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Hasil nilai["+i+"]" + this.nilai[i]);
        }
    }

    public static void main(String[] args){
        Array arrayobj = new Array(5);
        arrayobj.isiarray();
        arrayobj.menampilkanIsiArray();
    }


}