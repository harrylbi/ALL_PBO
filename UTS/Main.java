import Character.Character;
import Enemy.Enemy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulangi;

        do {
            System.out.println("Selamat datang di game Text RPG!");
            System.out.print("Masukkan nama karaktermu: ");
            String nama = scanner.nextLine();

            Character hero = new Character(nama);
            Enemy enemy = new Enemy("Enemy");

            int pilihan;

            while (true) {
                System.out.println("\nHP " + hero.getNama() + ": " + hero.getHp() +
                        " XP: " + hero.getExp() +
                        " | HP " + enemy.getNama() + ": " + enemy.getHp());
                System.out.println("Pilih aksi:");
                System.out.println("1. Serang");
                System.out.println("2. Bertahan");
                System.out.println("3. Minum Ramuan (sisa: " + hero.getSisaRamuan() + ")");
                System.out.println("4. Keluar");
                System.out.print("> ");
                pilihan = scanner.nextInt();

                switch (pilihan) {
                    case 1:
                        hero.attack(); // Tambah EXP
                        enemy.attacked(20);
                        if (enemy.getHp() > 0) {
                            System.out.println(enemy.getNama() + " menyerang balik! Damage: 15");
                            hero.attacked(15);
                        } else {
                            System.out.println("Musuh telah dikalahkan!");
                            break;
                        }
                        break;

                    case 2:
                        System.out.println(hero.getNama() + " bertahan! Damage berkurang.");
                        hero.attacked(5);
                        break;

                    case 3:
                        hero.gunakanRamuan();
                        break;

                    case 4:
                        System.out.println("Terima kasih telah bermain!");
                        scanner.nextLine(); // konsumsi newline
                        return;

                    default:
                        System.out.println("Pilihan tidak valid!");
                }

                if (hero.getHp() <= 0) {
                    System.out.println("\n" + hero.getNama() + " telah kalah...");
                    break;
                }

                if (enemy.getHp() <= 0) {
                    break;
                }
            }

            System.out.print("\nIngin main lagi? (Y/N): ");
            scanner.nextLine(); 
            ulangi = scanner.nextLine();

        } while (ulangi.equalsIgnoreCase("Y"));

        System.out.println("Terima kasih telah bermain!");
        scanner.close();
    }
}
