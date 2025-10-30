package Jobsheet8;
import java.util.Scanner;

public class NilaiKelompok07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int j, nilai, klmpkTertinggi = 0;
        float totalNilai, rataNilai, tertinggi = 0;

        int i = 1;
        while (i <= 6) { // Outer loop
            System.out.println("Kelompok "+ i);
            
            totalNilai = 0;
            for (j = 1; j <= 5; j++) { // Inner loop
                System.out.print("Nilai dari Kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;

            }
            rataNilai = totalNilai / 5;
            System.out.println("Kelompok " + i + ": nilai rata-rata = " + rataNilai);
            i++;

            if (rataNilai > tertinggi) { // Modifikasi
                tertinggi = rataNilai;
                klmpkTertinggi = i - 1;
            }
        }
        
        System.out.println("Rata-rata nilai tertinggi = " + tertinggi + " dari kelompok " + klmpkTertinggi);
        sc.close();
    }
}
