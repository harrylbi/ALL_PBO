package Character;

public class Character {
    protected String nama;
    protected int hp = 100;
    protected int level = 1;
    protected int exp = 0;
    protected int potions = 3;

    public Character(String nama) {
        this.nama = nama;
    }

    public void attack() {
        System.out.println(nama + " menyerang musuh!");
        tambahExp();
    }

    public void defend() {
        System.out.println(nama + " bertahan dari serangan!");
        hp -= 5;
    }

    public void tambahExp() {
        exp++;
        if (exp >= 10) {
            level++;
            exp = 0;
            System.out.println(nama + " naik level menjadi " + level);
        }
    }

    public void attacked(int damage) {
        hp -= damage;
        System.out.println(nama + " diserang dan kehilangan " + damage + " HP!");
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

    // Overloading
    public void gunakanRamuan(int jumlah) {
        for (int i = 0; i < jumlah && potions > 0; i++) {
            gunakanRamuan();
        }
    }

    public int getHp() {
        return hp;
    }

    public String getNama() {
        return nama;
    }
    
    public int getSisaRamuan() {
        return potions;
    }

    public int getExp(){
        return exp;
    }
    
}
