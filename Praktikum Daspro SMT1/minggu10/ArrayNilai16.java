package minggu10;
import java.util.Scanner;

public class ArrayNilai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        // Input nilai mahasiswa
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir mahasiswa ke-" + (i+1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }

        // Tampilkan status kelulusan semua mahasiswa
        System.out.println("\nStatus Kelulusan Mahasiswa:");
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Mahasiswa ke-" + (i+1) + ": ");
            if (nilaiAkhir[i] >= 70) {
                System.out.println("Lulus");
            } else {
                System.out.println("Tidak Lulus");
            }
        }
    }
}