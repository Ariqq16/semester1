package minggu12;
import java.util.Scanner;
public class SistemAbsensi16 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        String[] siswa = {"Nuril", "Hanif", "Nabil", "Ilham"};
        int[][] kehadiran = new int[siswa.length][7];

        //input kehadiran siswa
        for (int i = 0; i < siswa.length; i++) {
            System.out.println("Masukkan kehadiran untuk " + " (1 = hadir, 0 = tidak hadir):");
        }
    }
}
