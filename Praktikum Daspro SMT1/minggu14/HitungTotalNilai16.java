package minggu14;
import java.util.Scanner;
public class HitungTotalNilai16 {
    
    public static int hitungTtotalIteratif(int[] angka, int N) {
        int total = 0;
        for (int i = 0; i < N; i++) {
            total += angka[i];
        }
        return total;
    }

    public static int hitungTotalRekrusif(int[] angka, int N) {
        if (N <= 0) {
            return 0;
        }
        return angka[N - 1] + hitungTotalRekrusif(angka, N - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N = sc.nextInt();

        int[] angka = new int[N];

        //Memasukkan angka
        for (int i = N; i > 0; i--) {
            System.out.print("Masukkan angka ke-" + i + " : ");
            angka[N - i] = sc.nextInt();
        }

        //Menghitung total menggunakan fungsi iteratif
        int totalIteratif = hitungTtotalIteratif(angka, N);
        System.out.println("Total dari " + N + " angka yang dimasukkan menggunakan iteratif adalah: " + totalIteratif);

        //Menghitung total menggunakan fungsi Rekrusif
        int totaltRekrusif = hitungTotalRekrusif(angka, N);
        System.out.println("Total dari " + N + " angka yang dimasukkan menggunakan rekrusif adalah: " + totaltRekrusif);
    }
}
