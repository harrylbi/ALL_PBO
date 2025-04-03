package pratikum5.Latihan2;

import java.util.ArrayList;
import java.util.Scanner;

public class HitungNilai {
    static ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Daftar Nilai");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu (1-3) : ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Membuang newline setelah nextInt()

            switch (pilihan) {
                case 1:
                    inputData();
                    break;
                case 2:
                    tampilkanDaftarNilai();
                    break;
                case 3:
                    System.out.println("Program Selesai");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
    }

    public static void inputData() {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Nilai Tugas: ");
        double tugas = scanner.nextDouble();

        System.out.print("Nilai UTS: ");
        double uts = scanner.nextDouble();

        System.out.print("Nilai UAS: ");
        double uas = scanner.nextDouble();
        scanner.nextLine(); // Menghindari error saat membaca input selanjutnya

        // Hitung nilai akhir
        double nilaiAkhir = hitungNilaiAkhir(tugas, uts, uas);

        // Tambahkan data ke ArrayList
        daftarMahasiswa.add(new Mahasiswa(nim, nama, tugas, uts, uas, nilaiAkhir));

        System.out.println("Data Mahasiswa Berhasil Ditambahkan!\n");
    }

    public static void tampilkanDaftarNilai() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Data Mahasiswa Kosong");
            return;
        }

        System.out.println("\nDaftar Nilai Mahasiswa:");
        System.out.printf("| %-10s | %-20s | %-6s | %-6s | %-6s | %-6s |\n",
                "NIM", "Nama", "Tugas", "UTS", "UAS", "Nilai Akhir");

        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.printf("| %-10s | %-20s | %-6.2f | %-6.2f | %-6.2f | %-6.2f |\n",
                    mahasiswa.nim, mahasiswa.nama, mahasiswa.tugas, mahasiswa.uts, mahasiswa.uas, mahasiswa.nilaiAkhir);
        }
        System.out.println();
    }

    public static double hitungNilaiAkhir(double tugas, double uts, double uas) {
        return (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);
    }
}

class Mahasiswa {
    String nim;
    String nama;
    double tugas;
    double uts;
    double uas;
    double nilaiAkhir;

    public Mahasiswa(String nim, String nama, double tugas, double uts, double uas, double nilaiAkhir) {
        this.nim = nim;
        this.nama = nama;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
        this.nilaiAkhir = nilaiAkhir;
    }
}
