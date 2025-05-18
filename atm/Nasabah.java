package atm;

public class Nasabah {
    protected String nasabah;
    Mesin  mesin = new Mesin(0);

    public Nasabah(String nasabah, double saldoAwal){
        this.nasabah = nasabah;
        this.mesin = new Mesin(saldoAwal);
    }

    public String getNasabah() {
        return nasabah;
    }

    public double getSaldo(){
        return mesin.getSaldo();
    }

    public void tampilkaNama(){
        System.out.println(nasabah);
    }

    public void setor(double jumlah){
        mesin.setor(jumlah);
    }
    public void tarik(double jumlah){
        mesin.tarik(jumlah);
    }

}
