package Enemy;

import Character.Character;

public class Boss extends Character {

    public Boss(String nama) {
        super(nama);
        this.hp = 300;
        this.potions = 5;
    }

    @Override
    public void attack() {
        int damage = 25;
        exp++;
        System.out.println(nama + " (Boss) menyerang dengan kekuatan besar dan memberikan " + damage + " damage!");
        if (exp >= 8) {
            level++;
            exp = 0;
            System.out.println(nama + " (Boss) naik level! Sekarang level " + level);
        }
    }

    @Override
    public void defend() {
        int penguranganHp = 10;
        hp -= penguranganHp;
        System.out.println(nama + " (Boss) bertahan dan kehilangan " + penguranganHp + " HP.");
    }

    @Override
    public void gunakanRamuan() {
        if (hp < 100 && potions > 0) {
            hp += 30;
            potions--;
            System.out.println(nama + " (Boss) menggunakan ramuan kuat. HP sekarang: " + hp);
        }
    }
}
