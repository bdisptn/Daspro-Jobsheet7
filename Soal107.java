// Budi Septian Caraka
// 254107060062
// SIB-1B
// Soal ke-1

import java.util.Scanner;

public class Soal107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tertinggi = 0, terendah = 100;

        System.out.print("Masukkan jumlah data: ");
        int n = sc.nextInt();

        int[] nilai = new int[n];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilai[i] = sc.nextInt();   
             if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            } 
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
        System.out.println("Nilai tertinggi adalah " + tertinggi);
        System.out.println("Nilai terendah adalah " + terendah);
        
        sc.close();
    }
}