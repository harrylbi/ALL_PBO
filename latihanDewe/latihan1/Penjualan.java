package latihanDewe.latihan1;

public class Penjualan {
    private String kodeBarang;
    private String namaBarang;
    private float harga;
    private int jumlah;
    private float total;  // Ubah menjadi float untuk total

    public void setData(String kodeBarang, String namaBarang, float harga, int jumlah) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public float getTotalPembelian() {
        total = harga * jumlah;
        return total;
    }

    public String bonus() {
        float totalPembelian = getTotalPembelian();  // Gunakan totalPembelian sementara
        if (totalPembelian >= 100000 && jumlah > 5) {
            total = totalPembelian + (totalPembelian * 0.4f);
            System.out.println("Dapat bonus 40% dari total pembelian");
        } else if (totalPembelian >= 50000 && jumlah >= 3) {
            total = totalPembelian + (totalPembelian * 0.2f);
            System.out.println("Dapat bonus 20% dari total pembelian");
        } else if (totalPembelian >= 20000 && jumlah >= 2) {
            total = totalPembelian + (totalPembelian * 0.1f);
            System.out.println("Dapat bonus 10% dari total pembelian");
        }
        return String.valueOf(total);
    }

    public void cetakNota() {
        System.out.println("===== Nota Pembelian =====");
        System.out.println("Kode Barang   : " + kodeBarang);
        System.out.println("Nama Barang   : " + namaBarang);
        System.out.println("Harga Satuan  : Rp " + harga);
        System.out.println("Jumlah        : " + jumlah);
        System.out.println("Total Pembelian : Rp " + total);
        System.out.println("Bonus         : " + bonus());
        System.out.println("==========================");
    }
}
