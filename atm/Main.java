package atm;


public class Main {

    public static void main(String[] args){
        Mesin atm = new Mesin("harry", 1000);
        String nama =  atm.getNasabah();
        atm.tampilkaNama();
        System.out.println(nama);
        System.out.println(atm);

        System.out.println("nasabah: " + atm.getNasabah()  + ", saldo: " + atm.getSaldo());

    }

        
}