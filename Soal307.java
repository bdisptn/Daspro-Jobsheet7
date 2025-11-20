// Budi Septian Caraka
// 254107060062
// SIB-1B
// Soal ke-3

import java.util.Scanner;

public class Soal307 {

    // Method untuk menentukan grade
    public static char getGrade(double nilai) {
        if (nilai >= 85) return 'A';
        else if (nilai >= 70) return 'B';
        else if (nilai >= 55) return 'C';
        else if (nilai >= 40) return 'D';
        else return 'E';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();

        double[][] nilai = new double[n][3];
        char[][] grade = new char[n][3];

        System.out.println("\n=== INPUT NILAI MAHASISWA ===");
        for (int i = 0; i < n; i++) {
            System.out.println("Mahasiswa " + (i + 1));
            for (int j = 0; j < 3; j++) {
                System.out.print("  Nilai matkul " + (j + 1) + ": ");
                nilai[i][j] = sc.nextDouble();
                grade[i][j] = getGrade(nilai[i][j]);
            }
        }

        double[] rataMahasiswa = new double[n];
        double[] rataMatkul = new double[3];

        // Hitung rata-rata tiap mahasiswa
        for (int i = 0; i < n; i++) {
            double total = 0;
            for (int j = 0; j < 3; j++) {
                total += nilai[i][j];
            }
            rataMahasiswa[i] = total / 3.0;
        }

        // Hitung rata-rata tiap mata kuliah
        for (int j = 0; j < 3; j++) {
            double total = 0;
            for (int i = 0; i < n; i++) {
                total += nilai[i][j];
            }
            rataMatkul[j] = total / n;
        }

        // Cari matkul dengan rata-rata tertinggi
        int idxMax = 0;
        for (int j = 1; j < 3; j++) {
            if (rataMatkul[j] > rataMatkul[idxMax]) {
                idxMax = j;
            }
        }

        // Output tabel nilai
        System.out.println("\n=== TABEL NILAI DAN GRADE ===");
        for (int i = 0; i < n; i++) {
            System.out.println("Mahasiswa " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.println("  Matkul " + (j + 1) +
                                   " | Nilai: " + nilai[i][j] +
                                   " | Grade: " + grade[i][j]);
            }
            System.out.println("  Rata-rata: " + rataMahasiswa[i]);
            System.out.println();
        }

        System.out.println("=== RATA-RATA PER MATA KULIAH ===");
        for (int j = 0; j < 3; j++) {
            System.out.println("Matkul " + (j + 1) + ": " + rataMatkul[j]);
        }

        System.out.println("\nMata kuliah dengan rata-rata tertinggi: Matkul " + (idxMax + 1));

        sc.close();
    }
}
