package Jobsheet8;
import java.util.Scanner;

public class TugasJumlahKuadrat07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("n = " + i + " -> jumlah kuadrat = ");
            int jumlah = 0;
            for (int j = 1; j <= i; j++) {
                jumlah += j * j;
                System.out.print(j * j);
                if (j < i) {
                    System.out.print(" + ");
                }
            
            }
            System.out.println(" = " + jumlah);
        }

        sc.close();
    }
}
