package abstrak;

public class Mobil extends Kendaraan {
	private int kapasitasBagasi;

    public static void main(String[] args) {
        Kendaraan kendaraan = new Mobil();
        kendaraan.nyalakan();
    }
	@Override
	public void nyalakan() {
		// TODO Auto-generated method stub
		System.out.println("Mobil dinyalakan");
		
	}

}