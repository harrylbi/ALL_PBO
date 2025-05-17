package atm;

public class Mesin {
    protected double saldo;
    protected String nasabah;

    public Mesin(String nasabah, double saldo) {
        this.nasabah = nasabah;
        this.saldo = saldo;
    }

    public String getNasabah() {
        return nasabah;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setor(double jumlah){
        saldo += jumlah;
    }

    public void tarik (double jumlah){
        if (saldo <= jumlah){
            saldo -= jumlah;
        }
        else {
            System.out.println("saldo tidak cukup");
        }
    }

    public void tampilkaNama(){
        System.out.println(nasabah);
    }
    
}
