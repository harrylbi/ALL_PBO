package Enemy;

import Character.Character;
import Character.Fighter;

import java.util.Random;

public class Enemy extends Character implements Fighter {

    private Random random;

    public Enemy(String nama) {
        super(nama);
        this.hp = 150;
        this.random = new Random();
    }

    @Override
    public void attack() {
        if (hp < 50 && potions > 0) {
            gunakanRamuan();
            return;
        }

        int pilihan = random.nextInt(3); 

        switch (pilihan) {
            case 0:
                System.out.println(nama + " (Musuh) menyerang biasa!");
                break;
            case 1:
                useSkill(1);
                break;
            case 2:
                useSkill(2);
                break;
        }

        exp++;
        if (exp >= 5) {
            level++;
            exp = 0;
            System.out.println(nama + " (Musuh) naik level! Sekarang level " + level);
        }
    }

    @Override
    public void defend() {
        int penguranganHp = 3;
        hp -= penguranganHp;
        potions++;
        System.out.println(nama + " (Musuh) bertahan dan kehilangan " + penguranganHp + " HP, tapi mendapatkan 1 ramuan tambahan!");
    }

    @Override
    public void gunakanRamuan() {
        if (hp < 100 && potions > 0) {
            hp += 10;
            potions--;
            System.out.println(nama + " (Musuh) menggunakan ramuan. HP sekarang: " + hp);
        } else if (potions <= 0) {
            System.out.println(nama + " (Musuh) kehabisan ramuan!");
        } else {
            System.out.println(nama + " (Musuh) tidak menggunakan ramuan saat ini.");
        }
    }

    @Override
    public void useSkill(int skillNumber) {
        switch (skillNumber) {
            case 1:
                skill1();
                break;
            case 2:
                skill2();
                break;
            default:
                System.out.println(nama + " mencoba skill tidak dikenal.");
        }
    }

    @Override
    public void displayStatus() {
        System.out.println("Status Enemy:");
        System.out.println("Nama: " + nama);
        System.out.println("HP: " + hp);
        System.out.println("Potions: " + potions);
        System.out.println("Level: " + level);
        System.out.println("EXP: " + exp);
    }

    @Override
    public boolean isAlive() {
        return hp > 0;
    }

    public int getSisaRamuan() {
        return potions;
    }

    private void skill1() {
        int damage = 10;
        System.out.println(nama + " (Musuh) menggunakan Skill 1: Serangan Cepat! Damage: " + damage);
    }

    private void skill2() {
        int damage = 20;
        System.out.println(nama + " (Musuh) menggunakan Skill 2: Serangan Berat! Damage: " + damage);
    }
}
