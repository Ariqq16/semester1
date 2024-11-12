package minggu11;
import java.util.Scanner;
public class AnalisSurvey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] hasilSurvey = new int[10][6];

        //menyimpan hasil survey
        System.out.println("Masukkan hasil survey untuk 10 responden (nilai 1-5):  ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1));
            for (int j = 0; j < 6; j++) {
                System.out.print("jawaban untuk pertanyaan " + (j + 1) + " : ");
                hasilSurvey[i][j] = sc.nextInt();
            }
        }

        //menampilkan nilai rata-rata untuk setiap responden
        System.out.println("\nNilai rata-rata per responden: ");
        for (int i = 0; i < 10; i++) {
            int jumlah = 0;
            for (int j = 0; j < 6; j++) {
                jumlah += hasilSurvey[i][j];
            }
            double rataRata = jumlah / 6.0;
            System.out.println("Responden " + (i + 1) + " : " + rataRata);
        }

        //menampilkan nilai rata-rata untuk setiap pertanyaan
        System.out.println("\nNilai rata-rata per pertanyaan: ");
        for (int j = 0; j < 6; j++) {
            int jumlah = 0;
            for (int i = 0; i < 10; i++) {
                jumlah += hasilSurvey[i][j];
            }
            double rataRata = jumlah / 10.0;
            System.out.println("Pertanyaan " + (j + 1) + " : " + rataRata);
        }

        //menampilkan nilai rata-rata kesuluruhan
        int totalJumlah = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalJumlah += hasilSurvey[i][j];
            }
        }
        double rataRataKeseluruhan = totalJumlah / 60.0;
        System.out.println("\nNilai rata-rata keseluruhan: " + rataRataKeseluruhan);

    }
}
