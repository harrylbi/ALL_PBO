package pratikum5.Latihan1;



public class SingleArray {
    public static void main(String[] args) {
        int [] x;
        x = new int[3];
        x[0] = 10;
        x[1] = 20;
        x[2] = 30;
        for (int i = 0; i < x.length; i++) {
            System.out.println("Nilai array ke-" + i + " adalah " + x[i]);
        }
    }
    
}