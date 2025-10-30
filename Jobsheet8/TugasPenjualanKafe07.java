package Jobsheet8;

import java.util.Scanner;

public class TugasPenjualanKafe07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah cabang kafe: ");
        int cabang = sc.nextInt();

        System.out.println("\n=== INPUT PENJUALAN PER CABANG ===");

        int totalItemSemua = 0;
        int totalPelangganSemua = 0;

        for (int i = 1; i <= cabang; i++) {
            System.out.println("\n--- Cabang " + i + " ---");
            System.out.print("Jumlah pelanggan: ");
            int jmlPelanggan = sc.nextInt();

            int totalItem = 0;
            for (int j = 1; j <= jmlPelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int item = sc.nextInt();
                totalItem += item;
            }

            System.out.println("Cabang " + i + ": ");
            System.out.println("- Pelanggan: " + jmlPelanggan);
            System.out.println("- Item terjual: " + totalItem);

            totalPelangganSemua += jmlPelanggan;
            totalItemSemua += totalItem;

        }

        System.out.println("\nTotal seluruh cabang: ");
        System.out.println("- Pelanggan: " + totalPelangganSemua + " orang");
        System.out.println("- Item terjual: " + totalItemSemua + " item");

        sc.close();
    }
}
