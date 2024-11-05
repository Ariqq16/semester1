package minggu10;
import java.util.Scanner;

public class ArrayRataNilai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Meminta pengguna memasukkan jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        int totalLulus = 0, totalTidakLulus = 0, jumlahLulus = 0, jumlahTidakLulus = 0;
        double rata2Lulus, rata2TidakLulus;

        // Loop untuk mengisi nilai mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();

            // Menghitung total nilai dan jumlah mahasiswa untuk masing-masing kelompok
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }

        // Menghitung rata-rata nilai untuk masing-masing kelompok
        rata2Lulus = (jumlahLulus == 0) ? 0 : (double) totalLulus / jumlahLulus;
        rata2TidakLulus = (jumlahTidakLulus == 0) ? 0 : (double) totalTidakLulus / jumlahTidakLulus;

        // Menampilkan hasil
        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);
    }
}