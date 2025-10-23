import java.util.Scanner;

public class TugasPenjualanTiket07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int totalTiket = 0;
        double totalPenjualan = 0;

        System.out.println("==== PROGRAM PENJUALAN TIKET BIOSKOP ====");
        System.out.print("Masukkan jumlah pelanggan hari ini: ");
        int jmlPelanggan = sc.nextInt();

        int i = 1;
        while (i <= jmlPelanggan) {
            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan ke-" + i + ": ");
            int jmlTiket = sc.nextInt();

            if (jmlTiket < 0) {
                System.out.println("Jumlah tiket tidak boleh negatif! silakan masukkan ulang.");
                continue;
            }

            double totalHarga = jmlTiket * hargaTiket;
            
            if (jmlTiket > 10) {
                totalHarga -= (totalHarga * 0.15);
                System.out.println("Selamat anda mendapat diskon 15%.");
            } else if (jmlTiket > 4) {
                totalHarga -= (totalHarga * 0.1);
                System.out.println("Selamat anda mendapat diskon 10%.");
            }

            totalTiket += jmlTiket;
            totalPenjualan += totalHarga;

            System.out.printf("Total harga untuk pelanggan ke-%d: Rp %.2f%n", i, totalHarga);
            System.out.println("------------------------------------------");

            i++;
        }

        System.out.println("\n==== Laporan Penjualan Hari ini ====");
        System.out.println("Total tiket yang terjual hari ini adalah " + totalTiket + " tiket");
        System.out.println("Total penjualan hari ini sebesar Rp." + totalPenjualan);

        sc.close();
    }
}
