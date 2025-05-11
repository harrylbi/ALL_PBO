package pratikum4.latihan1;

public class Penjualan {

    private String kode;
    private String nama;
    private float harga;
    private int jumlah;

    public void setData(String kode, String nama, float harga, int jumlah) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public float getTotalPembelian() {
        return harga * jumlah;
    }

    public String getBonus() {
        float total = getTotalPembelian();
        if (total >= 5000000 && jumlah > 5) {
            return "Dapat bonus setrika";
        } else if (total >= 100000 && jumlah > 3) {
            return "Dapat bonus payung";
        } else if (total >= 50000 && jumlah > 2) {
            return "Dapat bonus ballpoint";
        } else {
            return "Tidak dapat bonus";
        }
    }

    // Perbaikan: Menambahkan return type void
    public void cetakNota() {
        System.out.println("===== NOTA PEMBELIAN =====");
        System.out.println("Kode Barang   : " + kode);
        System.out.println("Nama Barang   : " + nama);
        System.out.println("Harga Satuan  : Rp " + harga);
        System.out.println("Jumlah        : " + jumlah);
        System.out.println("Total Harga   : Rp " + getTotalPembelian());
        System.out.println("Bonus         : " + getBonus());
        System.out.println("==========================");
    }
}
