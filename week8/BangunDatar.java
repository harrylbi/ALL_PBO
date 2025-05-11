package week8;

public class BangunDatar {
    protected int sisi;
    protected int panjang;
    protected int lebar;
    protected double alas;
    protected double tinggi;
    protected double jarijari;
    public double luas;
    public double phi = 3.14;
    public String nama;

    // persegi
    public BangunDatar(String nama, int sisi) {
        this.nama = nama;
        this.sisi = sisi;
    }

    // persegi panjang
    public BangunDatar(String nama, int panjang, int lebar) {
        this.nama = nama;
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // segitiga
    public BangunDatar(String nama, double alas, double tinggi) {
        this.nama = nama;
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // lingkaran
    public BangunDatar(String nama, double jarijari) {
        this.nama = nama;
        this.jarijari = jarijari;
    }

    public double hitungluas() {
        switch (nama.toLowerCase()) {
            case "persegi":
                return sisi * sisi;
            case "persegi panjang":
                return panjang * lebar;
            case "segitiga":
                return 0.5 * alas * tinggi;
            case "lingkaran":
                return phi * jarijari * jarijari;
            default:
                return 0;
        }
    }
}
