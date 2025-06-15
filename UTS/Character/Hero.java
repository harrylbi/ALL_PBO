package Character;

public class Hero extends Character {

    public Hero(String nama) {
        super(nama);
    }

    @Override
    public void attack() {
        System.out.println(nama + " menyerang musuh!");
        tambahExp();
    }

    @Override
    public void defend() {
        System.out.println(nama + " bertahan dari serangan!");
        hp -= 5;
    }

    @Override
    public void gunakanRamuan() {
        if (potions > 0) {
            hp += 20;
            potions--;
            System.out.println(nama + " menggunakan ramuan. HP sekarang: " + hp);
        } else {
            System.out.println("Ramuan habis!");
        }
    }
    public void skill1() {
        int damage = 25;
        System.out.println(nama + " menggunakan Skill 1: Tebasan Cepat! Damage: " + damage);
        tambahExp();
    }

    public void skill2() {
        int damage = 40;
        System.out.println(nama + " menggunakan Skill 2: Serangan Kuat! Damage: " + damage);
        tambahExp();
    }

    public void skill3() {
        int damage = 15;
        int heal = 10;
        hp += heal;
        System.out.println(nama + " menggunakan Skill 3: Serangan & Pemulihan! Damage: " + damage + ", HP +"+heal);
        tambahExp();
    }

}
