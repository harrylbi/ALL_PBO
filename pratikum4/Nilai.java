package pratikum4;

import java.util.Scanner;

public class Nilai {    
    private String nHuruf;
    private String predikat;

    // Mengembalikan nilai huruf berdasarkan nilai akhir
    public String getNilaiHuruf(float nilai) {
        if (nilai >= 85)
            nHuruf = "A";
        else if (nilai >= 70)
            nHuruf = "B";
        else if (nilai >= 60)
            nHuruf = "C";
        else if (nilai >= 50)
            nHuruf = "D";
        else 
            nHuruf = "E";
        return nHuruf;
    }

    // Mengembalikan predikat berdasarkan nilai huruf
    public String getPredikat(char huruf) {
        switch(huruf) {
            case 'A': return "Apik";
            case 'B': return "Baik";
            case 'C': return "Cukup";
            case 'D': return "Dablek";
            default: return "Elek";
        }
    }

    // Menghitung nilai akhir berdasarkan bobot nilai tugas, UTS, dan UAS
    public float hitungNilaiAkhir(float tugas, float uts, float uas) {
        return (tugas * 0.20f) + (uts * 0.35f) + (uas * 0.45f);
    }

    // Mencetak hasil nilai
    public void cetakNilai(float tugas, float uts, float uas) {
        float nilaiAkhir = hitungNilaiAkhir(tugas, uts, uas);
        String huruf = getNilaiHuruf(nilaiAkhir);
        String predikat = getPredikat(huruf.charAt(0));

        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + huruf);
        System.out.println("Predikat    : " + predikat);
    }

    // public void inputNilai(){
    //         Scanner input = new Scanner(System.in);
    //         boolean lanjut = true;
            
    //         while (lanjut) {
    //             System.out.print("Masukkan nilai tugas: ");
    //             float tugas = input.nextFloat();
                
    //             System.out.print("Masukkan nilai UTS: ");
    //             float uts = input.nextFloat();
                
    //             System.out.print("Masukkan nilai UAS: ");
    //             float uas = input.nextFloat();
    
    //             Nilai nilai = new Nilai();
    //             nilai.cetakNilai(tugas, uts, uas);
                
    //             System.out.print("Apakah ingin menginput lagi? (y/n): ");
    //             String jawab = input.next();
    //             lanjut = jawab.equalsIgnoreCase("y");
    //         }
            
    //         input.close();

    // }
}
