package minggu10;
import java.util.ArrayList;
import java.util.Scanner;
public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nilaiMahasiswa = new ArrayList<>();
        
        System.out.print("Masukkan jumlah nilai yang akan diinput: ");
        int jumlahNilai = scanner.nextInt();
        
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            int nilai = scanner.nextInt();
            nilaiMahasiswa.add(nilai);
        }
        
        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int nilai : nilaiMahasiswa) {
            total += nilai;
            if (nilai > max) {
                max = nilai;
            }
            if (nilai < min) {
                min = nilai;
            }
        }
        
        double rataRata = (double) total / jumlahNilai;
        
        System.out.println("\nNilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
        System.out.println("Semua nilai yang dimasukkan: " + nilaiMahasiswa);
        
    }
}
