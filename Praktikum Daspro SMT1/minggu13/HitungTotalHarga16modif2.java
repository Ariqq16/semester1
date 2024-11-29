package minggu13;
import java.util.Scanner;

public class HitungTotalHarga16modif2 {
    public static int HitungTotalHarga16(int pilihanMenu, int banyakItem) {
        int[] hargaitems = {15000, 20000, 22000, 12000, 10000, 18000};
        return hargaitems[pilihanMenu - 1] * banyakItem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalKeseluruhan = 0;

        while (true) {
            System.out.print("\nMasukkan nomer menu yang ingin Anda pesan (atau 0 untuk selesai): ");
            int pilihanMenu = sc.nextInt();
            if (pilihanMenu == 0) break;

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            int totalHarga = HitungTotalHarga16(pilihanMenu, banyakItem);
            totalKeseluruhan += totalHarga;
            System.out.println("Subtotal harga untuk pesanan ini: Rp" + totalHarga);
        }

        sc.nextLine();  
        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.nextLine();

        if (kodePromo.equals("DISKON50")) {
            totalKeseluruhan *= 0.5;
            System.out.println("Anda mendapatkan diskon 50%!");
        } else if (kodePromo.equals("DISKON30")) {
            totalKeseluruhan *= 0.7;
            System.out.println("Anda mendapatkan diskon 30%!");
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo tidak valid. Tidak ada diskon yang diberikan.");
        }

        System.out.println("Total Harga Keseluruhan: Rp" + totalKeseluruhan);
    }
}
