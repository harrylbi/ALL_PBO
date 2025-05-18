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
            String inputnama = scanner.next();
            Nasabah namaNasabah = null;

            for (Nasabah n : daftarNasabah){
                if (n.getNasabah().equalsIgnoreCase(inputnama)){
                    namaNasabah = n;
                    break;

                }
            }

            if (namaNasabah == null ){
                System.out.println("nama nasabah salah periksa kembali namamu");
                continue;
            }

            System.out.println("\nMenu:");
            System.out.println("1. Informasi Saldo");
            System.out.println("2. Transfer");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Setor Tunai");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Saldo" + namaNasabah.getSaldo());
                    break;
                case 2:
                    System.out.println("masukan nama tujuan");
                    String tujuaNama = scanner.next();
                    Nasabah tujuan = null;
                    for (Nasabah n : daftarNasabah){
                        if (n.getNasabah().equalsIgnoreCase(tujuaNama)){
                            tujuan = n;
                            break;
                        }
                    }
                    if(tujuan == null){
                        System.out.println("Nasabah tujuan tidak ditemukan");
                        break;
                    }
                    System.out.println("masukan jumlah transfer: ");
                    double jumlahTransfer = scanner.nextDouble();
                    if (namaNasabah.getSaldo() >= jumlahTransfer){
                        namaNasabah.tarik(jumlahTransfer);
                        tujuan.setor(jumlahTransfer);
                        System.out.println("Transfer berhasil");

                    } else {
                        System.out.println("saldo tidak mencukupi");
                    }
                    break;
                case 3:
                    System.out.println("Masukan jumlah yang ditarik");
                    double tarik = scanner.nextDouble();
                    namaNasabah.tarik(tarik);
                    break;
                case 4:
                    System.out.println("Masukab jumlah setor");
                    double setor = scanner.nextDouble();
                    namaNasabah.setor(setor);
                    break;
                case 5:
                    System.out.println("terimakasih sudah menggunakan ATM LBi");
                    break;
            
                default:
                    System.out.println("pilihan tidak valid");
                    break;
            }    


       } while (true);

    }           
}
