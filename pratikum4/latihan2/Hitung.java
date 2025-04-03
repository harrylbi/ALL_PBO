package pratikum4.latihan2;

public class Hitung {
    private double a, b, c;

    // Konstruktor untuk menerima nilai a, b, dan c
    public Hitung(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Metode untuk menghitung diskriminan
    public double getDeterminan() {
        return (b * b) - (4 * a * c);
    }

    // Metode untuk menghitung akar persamaan kuadrat
    public void hitungAkar() {
        double D = getDeterminan();

        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Akar-akar real: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println("Akar kembar: x1 = x2 = " + x);
        } else {
            double realPart = -b / (2 * a);
            double imagPart = Math.sqrt(-D) / (2 * a);
            System.out.println("Akar imajiner: x1 = " + realPart + " + " + imagPart + "i");
            System.out.println("               x2 = " + realPart + " - " + imagPart + "i");
        }
    }
}

