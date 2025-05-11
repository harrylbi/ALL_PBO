package Enemy;

import Character.Character;


public class Enemy extends Character {

    public Enemy(String nama) {
        super(nama);
        this.hp = 150;
    }

    @Override
    public void attack() {
        int damage = 15;
        exp++; 
        System.out.println(nama + " (Musuh) menyerang dengan brutal dan memberikan " + damage + " damage!");
        
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
        System.out.println(nama + " (Musuh) bertahan keras dan kehilangan " + penguranganHp + " HP, tapi mendapatkan 1 ramuan tambahan!");
    }
}

