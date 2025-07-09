import Character.Fighter;
import Character.Hero;
import Enemy.Enemy;
import Enemy.Boss;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulangi = "";

        do {
            System.out.println("Selamat datang di game Text RPG!");
            System.out.print("Masukkan nama karaktermu: ");
            String nama = scanner.nextLine();

            Hero hero = new Hero(nama);
            Enemy enemy = new Enemy("Goblin");
            Boss boss = new Boss("Darklord");

            boolean menangLawanEnemy = false;

            
            System.out.println("\n--- Pertarungan Dimulai: Melawan " + enemy.getNama() + " ---");
            while (enemy.isAlive() && hero.isAlive()) {
                tampilkanStatus(hero, enemy);
                int pilihan = menu(scanner, hero);

                if (!aksiPlayer(pilihan, hero, enemy)) break;

                if (enemy.isAlive()) {
                    enemy.attack();
                    hero.attacked(15); 
                }
            }

            if (!hero.isAlive()) {
                System.out.println("\n" + hero.getNama() + " telah kalah dari " + enemy.getNama() + "...");
                continue;
            } else {
                hero.tambahHP(40);
                hero.tambahRamuan(4);
                menangLawanEnemy = true;
                System.out.println("\nSelamat! Kamu mengalahkan " + enemy.getNama() + "!");
            }

            
            if (menangLawanEnemy) {
                System.out.println("\n--- Pertarungan Final: Melawan " + boss.getNama() + " ---");
                while (boss.isAlive() && hero.isAlive()) {
                   
                    tampilkanStatus(hero, boss);
                    int pilihan = menu(scanner, hero);

                    if (!aksiPlayer(pilihan, hero, boss)) break;

                    if (boss.isAlive()) {
                        boss.attack();
                        hero.attacked(25); 
                    }
                }

                if (!hero.isAlive()) {
                    System.out.println("\n" + hero.getNama() + " telah dikalahkan oleh " + boss.getNama() + "...");
                } else {
                    System.out.println("\n Selamat! berhasil mengalahkan semua musuh!");
                }
            }

            System.out.print("\n main lagi? (Y/N): ");
            ulangi = scanner.nextLine();

        } while (ulangi.equalsIgnoreCase("Y"));

        System.out.println("Terima kasih telah bermain!");
        scanner.close();
    }

    
    private static void tampilkanStatus(Fighter hero, Fighter musuh) {
        System.out.println("\n== Status ==");
        hero.displayStatus();
        musuh.displayStatus();
    }

    
    private static int menu(Scanner scanner, Hero hero) {
        System.out.println("\nPilih aksi:");
        System.out.println("1. Serangan Biasa");
        System.out.println("2. Skill 1 (menebas dengan Cepat)");
        System.out.println("3. Skill 2 (Serangan Kuat)");
        System.out.println("4. Skill 3 (Serangan & Heal)");
        System.out.println("5. Minum Ramuan (Sisa: " + hero.getSisaRamuan() + ")");
        System.out.println("6. defend " );
        System.out.println("7. Keluar");
        System.out.print("> ");

        if (!scanner.hasNextInt()) {
            scanner.nextLine();
            return -1;
        }
        int pilihan = scanner.nextInt();
        scanner.nextLine();
        return pilihan;
    }

    private static boolean aksiPlayer(int pilihan, Hero hero, Fighter musuh) {
        switch (pilihan) {
            case 1:
                hero.attack();
                musuh.attacked(15); 
                return true;
            case 2:
                hero.useSkill(1);
                musuh.attacked(25); 
                return true;
            case 3:
                hero.useSkill(2);
                musuh.attacked(40); 
                return true;
            case 4:
                hero.useSkill(3);
                musuh.attacked(15); 
                return true;
            case 5:
                hero.gunakanRamuan();
                return true;
            case 6:
                hero.defend();
                System.out.println("defend");
                return true;
            case 7:
                System.out.println("Keluar dari game.");
                return false;
            default:
                System.out.println("Pilihan tidak valid!");
                return true;
        }
    }
}
