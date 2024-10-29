package minggu9;
import java.util.Scanner;

public class Persegi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = scanner.nextInt();

        if (N < 3) {
            System.out.println("Nilai N harus minimal 3");
            return;
        }

        // Bagian atas persegi
        for (int i = 0; i < N; i++) {
            System.out.print("5 ");
        }
        System.out.println();

        // Bagian tengah persegi
        for (int i = 0; i < N - 2; i++) {
            System.out.print("3 ");
            for (int j = 0; j < N - 2; j++) {
                System.out.print("  ");
            }
            System.out.print("5");
            System.out.println();
        }

        // Bagian bawah persegi
        for (int i = 0; i < N; i++) {
            System.out.print("5 ");
        }
        System.out.println();

        scanner.close();
    }
}

