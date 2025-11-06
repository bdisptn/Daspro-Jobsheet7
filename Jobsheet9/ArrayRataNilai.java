import java.util.Scanner;

public class ArrayRataNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalLulus = 0;
        double totalTidakLulus = 0;
        double rata2Lulus = 0;
        double rata2TidakLulus = 0;
        int lulus = 0;
        int tidakLulus = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt(); 

        int[] nilaiMhs = new int[n];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();   
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                lulus++;
                totalLulus += nilaiMhs[i];
                rata2Lulus = totalLulus/lulus;
            } else {
                tidakLulus++;
                totalTidakLulus += nilaiMhs[i];
                rata2TidakLulus = totalTidakLulus/tidakLulus;
            }        
        } 
        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);

        sc.close();
    }
}
