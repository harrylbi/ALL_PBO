package atm;

public class Mesin {
    protected double saldo;

    public Mesin( double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setor(double jumlah){
        saldo += jumlah;
    }

    public void tarik (double jumlah){
        if (saldo >= jumlah){
            saldo -= jumlah;
        }
        else {
            System.out.println("saldo tidak cukup");
        }
    }


    
}
