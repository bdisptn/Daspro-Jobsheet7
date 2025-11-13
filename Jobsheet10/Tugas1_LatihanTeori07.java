package Jobsheet10;

import java.util.Scanner;

public class Tugas1_LatihanTeori07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] survey = new int[10][6];
        double totalKeseluruhan = 0;

        // Input nilai survei
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden ke-" + (i+1));
            for (int j = 0; j < 6; j++) {
                System.out.print("Nilai pertanyaan " + (j+1) + " (1-5): ");
                survey[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        // Rata-rata per responden
        System.out.println("\nRata-rata per responden:");
        for (int i = 0; i < 10; i++) {
            double total = 0;
            for (int j = 0; j < 6; j++) {
                total += survey[i][j];
                totalKeseluruhan += survey[i][j];
            }
            System.out.println("Responden " + (i+1) + ": " + (total / 6));
        }

        // Rata-rata per pertanyaan
        System.out.println("\nRata-rata per pertanyaan:");
        for (int j = 0; j < 6; j++) {
            double total = 0;
            for (int i = 0; i < 10; i++) {
                total += survey[i][j];
            }
            System.out.println("Pertanyaan " + (j+1) + ": " + (total / 10));
        }

        // Rata-rata keseluruhan
        System.out.println("\nRata-rata keseluruhan: " + (totalKeseluruhan / (10 * 6)));
        sc.close();
    }
}
