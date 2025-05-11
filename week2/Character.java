package week2;

public class Character {

    String nama ;z
    int hp = 100;
    int level = 1;
    int exp = 0;

    public void setData(String nama) {
        this.nama = nama;
        this.hp = hp;
        this.level = level;
        this.exp = exp;


    }

    public String getNama(){
        return this.nama;
    }
    public int getHp(){
        return this.hp;
    }
    public int getLevel(){
        return this.level;
    }
    public int getExp(){
        return this.exp;
    }
    
    public void attack() {
        System.out.println(this.nama + " menyerang!");
        tambahExp(); 
    }


    public void levelUp(){
        this.exp++;
    }

    public void tambahExp(){
        this.exp++;
    }

    public void attacked(){
        this.hp -= 10;
    }


}