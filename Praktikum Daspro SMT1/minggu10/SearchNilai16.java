package minggu10;
import java.util.Scanner;
public class SearchNilai16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan banyaknya elemen array
        System.out.print("Masukkan banyaknya nilai: ");
        int jumlahElemen = scanner.nextInt();

        // Membuat array dengan ukuran yang sesuai
        int[] arrNilai = new int[jumlahElemen];

        // Meminta pengguna memasukkan nilai-nilai ke dalam array
        System.out.println("Masukkan nilai-nilai:");
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            arrNilai[i] = scanner.nextInt();
        }

        // Meminta pengguna memasukkan nilai yang ingin dicari
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = scanner.nextInt();

        // Mencari nilai dalam array
        int hasil = -1;
        for (int i = 0; i < arrNilai.length; i++) {
            if (arrNilai[i] == key) {
                hasil = i;
                break;
            }
        }

        // Menampilkan hasil pencarian
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + hasil);
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan.");
        }
    }
}