package abstrak;

public class Truk extends Kendaraan {
    private int kapasitasBak;

    public Truk() {
        // konstruktor default
    }

    public Truk(int kapasitasBak) {
        this.kapasitasBak = kapasitasBak;
    }

    @Override
    public void nyalakan() {
        System.out.println("Truk dinyalakan.");
    }

    public int getKapasitasBak() {
        return kapasitasBak;
    }

    public void setKapasitasBak(int kapasitasBak) {
        this.kapasitasBak = kapasitasBak;
    }
}
