package minggu7;
import java.util.Scanner;
public class Bioskop16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int HargaTiket = 50000, TotalTiket = 0, TotalPenjualan = 0;
        int JumlahTiket, HargaTotal;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang di beli (atau ketik -1 atau selesai): ");
            JumlahTiket = sc.nextInt();

            if(JumlahTiket < 0 && JumlahTiket != -1) {
                System.out.println("Jumlah tiket tidak valid, silahkan masukkan jumlah yang benar");
                continue;
            }

            if (JumlahTiket == -1) {
                break;
            }

            HargaTotal = HargaTiket * JumlahTiket;
            if (JumlahTiket > 10) {
                HargaTotal *= 0.05;
            } else if (JumlahTiket > 4) {
                HargaTotal *= 0.10; 
            }

            TotalTiket += JumlahTiket;
            TotalPenjualan += HargaTotal;

            System.out.println("Total harga yang untuk pembelian ini: Rp " + HargaTotal);

            System.out.println("n/Total tiket terjual: " +TotalTiket);
            System.out.println("Total penjualan Tiket: Rp " +TotalPenjualan);
        }
    }
}
