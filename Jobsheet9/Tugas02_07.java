import java.util.Scanner;

public class Tugas02_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n==== Sistem Pemesanan Cafe ====");
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        String[] namaPesanan = new String[jumlah];
        double[] hargaPesanan = new double[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));
            System.out.print("Masukkan nama makanan/minuman: ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Masukkan harga: Rp ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine();
        }

        double total = 0;
        for (int i = 0; i < jumlah; i++) {
            total += hargaPesanan[i];
        }


        System.out.println("\nDAFTAR PESANAN");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }

        System.out.println("Total Biaya: Rp " + total);
        sc.close();
    }
}
