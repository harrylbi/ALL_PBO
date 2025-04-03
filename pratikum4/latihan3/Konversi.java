package pratikum4.latihan3;

public class Konversi {
    private int totalDetik;

    public Konversi(int totalDetik) {
        this.totalDetik = totalDetik;
    }

    public void hitungKonversi() {
        int hari = totalDetik / 86400;
        int sisaDetik = totalDetik % 86400;

        int jam = sisaDetik / 3600;
        sisaDetik %= 3600;

        int menit = sisaDetik / 60;
        int detik = sisaDetik % 60;

        System.out.println("Detik    : " + totalDetik);
        System.out.println("Hari     : " + hari);
        System.out.println("Jam      : " + jam);
        System.out.println("Menit    : " + menit);
        System.out.println("Detik    : " + detik);
    }
}
