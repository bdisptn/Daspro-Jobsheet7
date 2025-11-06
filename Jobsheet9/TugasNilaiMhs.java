import java.util.Scanner;

public class TugasNilaiMhs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        double rata2 = 0;
        int tertinggi = 0;
        int terendah = 100;
        
        System.out.println("\n=== Program Nilai Mahasiswa ===");
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();

        int[] nilaiMhs = new int[n];
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();   
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah " + nilaiMhs[i]);
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        rata2 = total/nilaiMhs.length;
        System.out.println("Nilai tertinggi adalah " + tertinggi);
        System.out.println("Nilai terendah adalah " + terendah);
        System.out.println("Rata-rata nilai " + rata2);

        sc.close();
    }
}
