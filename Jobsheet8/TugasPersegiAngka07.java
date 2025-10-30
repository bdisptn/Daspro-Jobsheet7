package Jobsheet8;
import java.util.Scanner;

public class TugasPersegiAngka07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah N (minimal 3): ");
        int N = sc.nextInt();

        for (int iOuter = 1; iOuter <= N; iOuter++) {
            for (int i = 1; i <= N; i++) {
                if (i == 1 || i == N || iOuter == 1 || iOuter == N) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
