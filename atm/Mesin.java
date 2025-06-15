package atm;

public class Mesin {
    protected double saldo;

    public Mesin(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setor(double jumlah) {
        saldo += jumlah;
    }

    public void tarik(double jumlah) {
        if (jumlah % 20000 != 0) {
            System.out.println("Penarikan harus dalam kelipatan Rp20.000");
        } else if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil. Sisa saldo: Rp" + saldo);
        } else {
            System.out.println("Saldo tidak cukup.");
        }
    }
}
