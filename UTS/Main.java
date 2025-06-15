import Character.Character;
import Character.Hero;
import Enemy.Enemy;
import Enemy.Boss;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulangi= "";

        do {
            System.out.println("Selamat datang di game Text RPG!");
            System.out.print("Masukkan nama karaktermu: ");
            String nama = scanner.nextLine();

            Hero hero = new Hero(nama);
            Enemy enemy = new Enemy("Goblin");
            Boss boss = new Boss("Darklord");

            boolean menangLawanEnemy = false;

            // Pertarungan pertama: lawan musuh biasa
            System.out.println("\n--- Pertarungan Dimulai: Melawan " + enemy.getNama() + " ---");
            while (enemy.getHp() > 0 && hero.getHp() > 0) {
                tampilkanStatus(hero, enemy);
                int pilihan = menu(scanner, hero);

                if (!aksiPlayer(pilihan, hero, enemy)) break;

                if (enemy.getHp() > 0) {
                    if (enemy.getHp() < 50) {
                        enemy.gunakanRamuan();
                    }
                    enemy.attack();
                    hero.attacked(15);
                }
            }

            if (hero.getHp() <= 0) {
                System.out.println("\n" + hero.getNama() + " telah kalah dari " + enemy.getNama() + "...");
                continue;
            } else {
                menangLawanEnemy = true;
                System.out.println("\nSelamat! Kamu mengalahkan " + enemy.getNama() + "!");
            }

            // Pertarungan kedua: lawan boss
            if (menangLawanEnemy) {
                System.out.println("\n--- Pertarungan Final: Melawan " + boss.getNama() + " ---");
                while (boss.getHp() > 0 && hero.getHp() > 0) {
                    tampilkanStatus(hero, boss);
                    int pilihan = menu(scanner, hero);

                    if (!aksiPlayer(pilihan, hero, boss)) break;

                    if (boss.getHp() > 0) {
                        if (boss.getHp() < 100) {
                            boss.gunakanRamuan();
                        }
                        boss.attack();
                        hero.attacked(25);
                    }
                }

                if (hero.getHp() <= 0) {
                    System.out.println("\n" + hero.getNama() + " telah dikalahkan oleh " + boss.getNama() + "...");
                } else {
                    System.out.println("\n🎉 Selamat! Kamu berhasil mengalahkan semua musuh dan menjadi pahlawan sejati!");
                }
            }

            System.out.print("\nIngin main lagi? (Y/N): ");
            ulangi = scanner.nextLine();

        } while (ulangi.equalsIgnoreCase("Y"));

        System.out.println("Terima kasih telah bermain!");
        scanner.close();
    }

    // Menampilkan status HP dan EXP
    private static void tampilkanStatus(Hero hero, Character musuh) {
        System.out.println("\n== Status ==");
        System.out.println(hero.getNama() + " - HP: " + hero.getHp() + " | EXP: " + hero.getExp());
        System.out.println(musuh.getNama() + " - HP: " + musuh.getHp());
    }

    // Menampilkan menu dan mengambil input
    private static int menu(Scanner scanner, Hero hero) {
        System.out.println("\nPilih aksi:");
        System.out.println("1. Serangan Biasa");
        System.out.println("2. Skill 1 (Tebasan Cepat)");
        System.out.println("3. Skill 2 (Serangan Kuat)");
        System.out.println("4. Skill 3 (Serangan & Heal)");
        System.out.println("5. Minum Ramuan (Sisa: " + hero.getSisaRamuan() + ")");
        System.out.println("6. Keluar");
        System.out.print("> ");

        if (!scanner.hasNextInt()) {
            scanner.nextLine();
            return -1;
        }
        int pilihan = scanner.nextInt();
        scanner.nextLine();
        return pilihan;
    }

    // Menjalankan aksi berdasarkan pilihan
    private static boolean aksiPlayer(int pilihan, Hero hero, Character musuh) {
        switch (pilihan) {
            case 1:
                hero.attack();
                musuh.attacked(15);
                return true;
            case 2:
                hero.skill1();
                musuh.attacked(25);
                return true;
            case 3:
                hero.skill2();
                musuh.attacked(40);
                return true;
            case 4:
                hero.skill3();
                musuh.attacked(15);
                return true;
            case 5:
                hero.gunakanRamuan();
                return true;
            case 6:
                System.out.println("Keluar dari game.");
                return false;
            default:
                System.out.println("Pilihan tidak valid!");
                return true;
        }
    }
}
