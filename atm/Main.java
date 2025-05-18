package atm;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        ArrayList <Nasabah>  daftarNasabah = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        Nasabah n1 = new Nasabah("harry",50000);
        Nasabah n2 = new Nasabah("lbi",60000);

        daftarNasabah.add(n1);
        daftarNasabah.add(n2);

        int pilihan;
         
        // for (Nasabah n :daftarNasabah){
        //     System.out.println("nama: " + n.getNasabah());
        //     System.out.println("nama: " + n.getSaldo());
        //     System.out.println("-------");
        //     pilihan = scanner.nextInt();
        // }
        do {
            System.out.println("Selemat datang di ATM BANK LBI");
                            
            System.out.println("1.Information Saldo");
            System.out.println("2.Transfer");
            System.out.println("3.Tarik tunai");
            System.out.println("4.Setor tunai");
            System.out.println("5.keluar");
            
            Nasabah daftarNasabah;
            switch (pilihan) {
                case 1:
                    System.out.println("Saldo" + daftarNasabah.getSaldo());
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            
                default:
                    break;
            }    

    } while (pilihan !=5);

           
}