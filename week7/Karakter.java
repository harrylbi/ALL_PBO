package week7;

public class Character {

    private String nama ;
    private int health;
    private int attackPower;



    public void setName(string name){
        this.name = name;
    }

    public void setHealth(){
        this.health = health;
    }

    public void setData(String nama) {
        this.nama = nama;
        this.health = health;
        this.attackPower = attackPower;

    }

    public void setAttack(){
        System.out.println(this.nama + "tatakae");
        attackPower()

    }

    public attackpower(){
        this.attackPower++;
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