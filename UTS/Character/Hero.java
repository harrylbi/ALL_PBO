package Character;

public class Hero extends Character implements Fighter {

    public Hero(String nama) {
        super(nama);
    }

    public void attack() {
        System.out.println(nama + " menyerang musuh dengan pedang!");
        tambahExp();
    }    


    public void defend() {
        System.out.println(nama + " bertahan dari serangan!");
        hp -= 5; 
    }

    public void gunakanRamuan() {
        if (potions > 0) {
            hp += 20;
            potions--;
            System.out.println(nama + " menggunakan ramuan. HP sekarang: " + hp);
        } else {
            System.out.println("Ramuan habis!");
        }
    }

    public void useSkill(int skillNumber) {
        switch (skillNumber) {
            case 1:
                skill1();
                break;
            case 2:
                skill2();
                break;
            case 3:
                skill3();
                break;
            default:
                System.out.println("Skill tidak valid!");
        }
    }

    
    public void displayStatus() {
        System.out.println("Status Hero:");
        System.out.println("Nama: " + nama);
        System.out.println("HP: " + hp);
        System.out.println("Potions: " + potions);
        System.out.println("Level: " + level);
        System.out.println("EXP: " + exp);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    private void skill1() {
        int damage = 25;
        System.out.println(nama + " menggunakan Skill 1: Tebasan Cepat! Damage: " + damage);
        tambahExp();
    }

    private void skill2() {
        int damage = 40;
        System.out.println(nama + " menggunakan Skill 2: Serangan Kuat! Damage: " + damage);
        tambahExp();
    }

    private void skill3() {
        int damage = 15;
        int heal = 10;
        hp += heal;
        System.out.println(nama + " menggunakan Skill 3: Serangan & Pemulihan! Damage: " + damage + ", HP +" + heal);
        tambahExp();
    }

    // @Override
    // public void attacked(int damage) {
    //     hp -= damage;
    //     System.out.println(nama + " menerima " + damage + " damage! HP sekarang: " + hp);
    // }
        public int getSisaRamuan() {
        return potions;
    }
    public void tambahHP(int jumlah){
        hp += jumlah;
        System.out.println("mendapatkan suplemen hp");
    }

    public void tambahRamuan(int jumlah){
        potions += jumlah;
        System.out.println("");
    }



}
