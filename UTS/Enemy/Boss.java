package Enemy;

import Character.Character;
import Character.Fighter;

import java.util.Random;

public class Boss extends Character implements Fighter {
    private Random random;

    public Boss(String nama) {
        super(nama);
        this.hp = 250;
        this.potions = 5;
        this.random = new Random();
    }

    @Override
    public void attack() {
        // AI logic: gunakan ramuan jika HP < 100
        if (hp < 100 && potions > 0) {
            gunakanRamuan();
            return;
        }

        int serangan = random.nextInt(3); // 0, 1, 2
        switch (serangan) {
            case 0:
                basicAttack();
                break;
            case 1:
                heavyAttack();
                break;
            case 2:
                areaAttack();
                break;
            default:
                System.out.println(getNama() + " (Boss) tidak melakukan serangan.");
        }

        tambahExp();
    }

    @Override
    public void defend() {
        int penguranganHp = 10;
        this.hp -= penguranganHp;
        System.out.println(getNama() + " (Boss) bertahan dan kehilangan " + penguranganHp + " HP.");
    }

    @Override
    public void gunakanRamuan() {
        if (this.hp < 300 && this.potions > 0) {
            this.hp += 30;
            this.potions--;
            System.out.println(getNama() + " (Boss) menggunakan ramuan. HP sekarang: " + this.hp);
        } else if (this.potions == 0) {
            System.out.println("Ramuan (Boss) habis!");
        } else {
            System.out.println(getNama() + " (Boss) tidak menggunakan ramuan. HP masih penuh!");
        }
    }

    @Override
    public void useSkill(int skillNumber) {
        System.out.println(getNama() + " tidak menggunakan skill spesifik. Serangannya acak!");
    }

    @Override
    public void displayStatus() {
        System.out.println("Status Boss:");
        System.out.println("Nama: " + getNama());
        System.out.println("HP: " + this.hp);
        System.out.println("Potions: " + this.potions);
        System.out.println("Level: " + this.level);
        System.out.println("EXP: " + this.exp);
    }

    @Override
    public boolean isAlive() {
        return this.hp > 0;
    }

    private void basicAttack() {
        int damage = 15;
        System.out.println(getNama() + " (Boss) melakukan Basic Attack, memberikan " + damage + " damage!");
    }

    private void heavyAttack() {
        int damage = 30;
        System.out.println(getNama() + " (Boss) melakukan Heavy Attack, memberikan " + damage + " damage besar!");
    }

    private void areaAttack() {
        int damage = 20;
        System.out.println(getNama() + " (Boss) melakukan Area Attack, memberikan " + damage + " damage ke semua lawan!");
    }
}
