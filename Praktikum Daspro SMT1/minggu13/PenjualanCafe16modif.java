package minggu13;
import java.util.Scanner;

public class PenjualanCafe16modif {
    static int jumlahMahasiswa;
    static int jumlahTugas;
    static int[][] penjualan; // Array penjualan yang ukurannya akan ditentukan oleh input

    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

    // Fungsi untuk menginput jumlah mahasiswa dan jumlah tugas
    public static void inputJumlahMahasiswaDanTugas() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah tugas: ");
        jumlahTugas = sc.nextInt();

        // Inisialisasi array penjualan berdasarkan jumlah mahasiswa dan tugas
        penjualan = new int[jumlahMahasiswa][jumlahTugas];

        // Menginput data penjualan
        for (int i = 0; i < jumlahMahasiswa; i++) {
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Masukkan nilai mahasiswa " + (i + 1) + " untuk tugas " + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }

    // Fungsi untuk menampilkan seluruh data penjualan (nilai) dari mahasiswa
    public static void tampilkanDataPenjualan() {
        System.out.println("Data Penjualan (Nilai Tugas) Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Mahasiswa " + (i + 1) + " : ");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk menampilkan mahasiswa dengan nilai tertinggi
    public static void mahasiswaNilaiTertinggi() {
        int totalTertinggi = 0;
        int mahasiswaTertinggi = -1;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            int totalNilai = 0;
            for (int j = 0; j < jumlahTugas; j++) {
                totalNilai += penjualan[i][j];
            }
            if (totalNilai > totalTertinggi) {
                totalTertinggi = totalNilai;
                mahasiswaTertinggi = i;
            }
        }
        System.out.println("Mahasiswa dengan nilai tertinggi: Mahasiswa " + (mahasiswaTertinggi + 1) + " dengan total nilai " + totalTertinggi);
    }

    // Fungsi untuk menampilkan rata-rata nilai dari setiap mahasiswa
    public static void rataRataNilai() {
        System.out.println("Rata-rata Nilai Mahasiswa: ");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            int totalNilai = 0;
            for (int j = 0; j < jumlahTugas; j++) {
                totalNilai += penjualan[i][j];
            }
            double rataRata = (double) totalNilai / jumlahTugas;
            System.out.println("Mahasiswa " + (i + 1) + " : " + rataRata);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        // Menampilkan menu hingga pengguna memilih untuk keluar
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input Jumlah Mahasiswa dan Tugas");
            System.out.println("2. Input Data Penjualan (Nilai)");
            System.out.println("3. Tampilkan Data Penjualan");
            System.out.println("4. Tampilkan Mahasiswa dengan Nilai Tertinggi");
            System.out.println("5. Tampilkan Rata-rata Nilai");
            System.out.println("6. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();

            // Menentukan pilihan
            if (pilihan == 1) {
                inputJumlahMahasiswaDanTugas();
            } else if (pilihan == 2) {
                // Fungsi untuk input data penjualan nilai
                inputJumlahMahasiswaDanTugas(); 
            } else if (pilihan == 3) {
                tampilkanDataPenjualan();
            } else if (pilihan == 4) {
                mahasiswaNilaiTertinggi();
            } else if (pilihan == 5) {
                rataRataNilai();
            } else if (pilihan == 6) {
                System.out.println("Keluar dari program.");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
