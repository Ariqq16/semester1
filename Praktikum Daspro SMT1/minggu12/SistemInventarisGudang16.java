package minggu12;
import java.util.Scanner;

public class SistemInventarisGudang16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenisBarang, lokasi, jumlah;
        int JmlBarang = 5; // Jumlah jenis barang
        int JmlLokasi = 3; // Jumlah lokasi penyimpanan

        int[][] StokBarang = new int[JmlBarang][JmlLokasi];
        String[] namaKota = new String[JmlLokasi];

        // Input nama kota
        for (int i = 0; i < JmlLokasi; i++) {
            System.out.print("Masukkan nama kota untuk lokasi " + (i + 1) + ": ");
            namaKota[i] = sc.nextLine();
        }

        // Fungsi untuk mengisi stok barang
        System.out.println("\nMengisi Stok Barang: ");
        for (int i = 0; i < 3; i++) { 
            System.out.print("Jenis Barang (0-" + (JmlBarang - 1) + "): ");
            jenisBarang = sc.nextInt();
            System.out.print("Lokasi (0-" + (JmlLokasi - 1) + "): "); 
            lokasi = sc.nextInt();
            System.out.print("Tambah Stok: ");
            jumlah = sc.nextInt();

            // Validasi input untuk jenis barang dan lokasi
            if (jenisBarang >= 0 && jenisBarang < JmlBarang && lokasi >= 0 && lokasi < JmlLokasi) {
                StokBarang[jenisBarang][lokasi] += jumlah; // Menambahkan stok
            } else {
                System.out.println("Indeks barang atau lokasi tidak valid. Silakan coba lagi.");
            }
        }

        // Fungsi untuk menampilkan tabel stok barang
        System.out.println("\nTabel Stok Barang: ");

        // Menampilkan nama kota di bagian atas tabel
        System.out.print("Jenis Barang | ");
        for (String kota : namaKota) { 
            System.out.print(" " + kota + " | ");
        }
        System.out.println();

        // Menampilkan stok untuk setiap jenis barang
        for (int i = 0; i < JmlBarang; i++) { 
            System.out.print("Barang " + i + "    | ");
            for(int j = 0; j < JmlLokasi; j++) { 
                System.out.print(" " + StokBarang[i][j] + "    |"); 
            }
            System.out.println();
        }

        // Menghitung dan menampilkan total stok per jenis barang
        System.out.println("\nTotal Stok per jenis Barang:");
        for (int i = 0; i < JmlBarang; i++) {
            int totalStok = 0;
            for (int j = 0; j < JmlLokasi; j++) { 
                totalStok += StokBarang[i][j];
            }
            System.out.println("Barang " + i + " : " + totalStok);
        }

        // Fungsi untuk menemukan lokasi dengan stok terbanyak untuk setiap jenis barang
        System.out.println("\nLokasi dengan Stok Terbanyak untuk Setiap Jenis Barang: ");
        for (int i = 0; i < JmlBarang; i++) {
            int maxStok = StokBarang[i][0];
            int indeksKotaMax = 0;
            for (int j = 1; j < JmlLokasi; j++) { 
                if (StokBarang[i][j] > maxStok) {
                    maxStok = StokBarang[i][j];
                    indeksKotaMax = j;
                }
            }
            System.out.println("Barang " + i + " : " + namaKota[indeksKotaMax] + " dengan stok " + maxStok);
        }

        
    }
}