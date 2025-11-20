// Budi Septian Caraka
// 254107060062
// SIB-1B
// Soal ke-2

import java.util.Scanner;

public class Soal207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah kota (k): ");
        int k = sc.nextInt();

        System.out.print("Masukkan jumlah hari (h): ");
        int h = sc.nextInt();

        double[][] suhu = new double[k][h];

        for (int i = 0; i < k; i++) {
            System.out.println("Kota " + (i + 1) + ":");
            for (int j = 0; j < h; j++) {
                System.out.print("  Hari " + (j + 1) + ": ");
                suhu[i][j] = sc.nextDouble();
            }
        }

        double[] rataRata = new double[k];


        for (int i = 0; i < k; i++) {
            double max = suhu[i][0];
            double min = suhu[i][0];
            double total = 0;

            for (int j = 0; j < h; j++) {
                double val = suhu[i][j];
                if (val > max) {
                    max = val;
                }
                if (val < min) {
                    min = val;
                }
                total += val;
            }

            rataRata[i] = total / h;

            System.out.println("\nKota " + (i + 1) + ":");
            System.out.println("  Suhu maksimum : " + max);
            System.out.println("  Suhu minimum  : " + min);
            System.out.println("  Rata-rata     : " + rataRata[i]);
        }

        
        int rataMax = 0, rataMin = 0;
        for (int i = 1; i < k; i++) {
            if (rataRata[i] > rataRata[rataMax]) {
                rataMax = i;
            }
            if (rataRata[i] < rataRata[rataMin]) {
                rataMin = i;
            }
        }

        System.out.println("Kota dengan rata-rata suhu tertinggi : Kota " + (rataMax + 1));
        System.out.println("Kota dengan rata-rata suhu terendah  : Kota " + (rataMin + 1));

        sc.close();
    }
}