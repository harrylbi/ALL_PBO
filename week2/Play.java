package week2;

public class Play {
    public static void main(String[] args) {
        // Membuat objek Character dengan parameter
        Character player1 = new Character();

        player1.setData("ucok");
        System.out.println("informasi player");
        System.out.println("Nama: " + player1.getNama());
        System.out.println("HP:" + player1.getHp());
        System.out.println("level:" + player1.getLevel());
        System.out.println("exp:" + player1.getExp());

    }
}
