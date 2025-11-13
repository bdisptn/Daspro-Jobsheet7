package Jobsheet10;

import java.util.Scanner;

public class BioskopWithScanner07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu;
        String nama;

        String[][] penonton = new String[4][2];

        while (true) {

            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Posisi kursi tidak valid!");
                    } else if (penonton[baris-1][kolom-1] != null) {
                        System.out.println("Kursi sudah terisi oleh " + penonton[baris-1][kolom-1]);
                    } else {
                        penonton[baris-1][kolom-1] = nama;
                        System.out.println("Data penonton berhasil disimpan!");
                    }
                    break;

                case 2:
                    System.out.println("\n=== DAFTAR PENONTON ===");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String isi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                            System.out.print(isi + "\t");
                        }
                        System.out.println();
                    }
                    break;
                
                case 3:
                    System.out.println("Terima kasih! Program selesai.");
                    sc.close();
                    return;

                default:
                    System.out.println("Menu tidak valid! Silakan pilih 1-3.");
                    
            }
        }  
    }
}
