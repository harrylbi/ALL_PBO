package Character;

public abstract class Character {
    protected String nama;
    protected int hp;
    protected int potions;
    protected int level;
    protected int exp;

    public Character(String nama) {
        this.nama = nama;
        this.hp = 100; 
        this.potions = 3; 
        this.level = 1; 
        this.exp = 0; 
    }

    // public abstract void attack();
    // public abstract void defend();
    // public abstract void gunakanRamuan();

    public void tambahExp() {
        exp += 10; 
        if (exp >= 100) {
            level++;
            exp -= 100;
            System.out.println(nama + " naik level ke " + level + "!");
        }
    }

    public String getNama() {
        return nama;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void attacked(int damage) {
        hp -= damage;
        System.out.println(nama + " diserang dan kehilangan " + damage + " HP! HP sekarang: " + hp);
    }
}
