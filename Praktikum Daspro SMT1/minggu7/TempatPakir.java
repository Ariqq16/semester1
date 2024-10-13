package minggu7;
import java.util.Scanner;
public class TempatPakir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int JenisKendaraan, TotalPembayaran = 0;
        int Durasi, BiayaParkir = 0;

        while (true) {
            System.out.print("Masukkan Jenis kendaraan (1 untuk  mobil, 2 untuk motor, 0 untuk keluar): ");
            JenisKendaraan = sc.nextInt();

            if(JenisKendaraan == 0){
                break;
            }

            if(JenisKendaraan != 1 && JenisKendaraan != 2){
                System.out.println("Jenis kendaraan tidak valid. Silahkan masukkan 1 untuk Mobil atau 2 untuk motor. ");
                continue;
            }

            System.out.println("Masukkan durasi parkir dalam jam: ");
            Durasi = sc.nextInt();

            if (Durasi > 5) {
                BiayaParkir =   12500 * Durasi;
            } else {
                if (JenisKendaraan ==1) {
                    BiayaParkir = 3000 * Durasi;
                } else if (JenisKendaraan ==2) {
                    BiayaParkir = 2000 * Durasi;
                }
            }
            TotalPembayaran += BiayaParkir;
            System.out.println("Biaya parkir untuk kendaraan ini: Rp " +BiayaParkir);

            System.out.println("\nTotal pembayaran parkir: Rp " + TotalPembayaran);

        }

    }
}
