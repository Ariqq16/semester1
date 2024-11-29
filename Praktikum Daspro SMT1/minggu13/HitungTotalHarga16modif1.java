package minggu13;
import java.util.Scanner;
public class HitungTotalHarga16modif1 {
    public static  int HitungTotalHarga16(int pilihanMenu, int banyakItem   ) {
        int[] hargaitems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaitems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMasukkan nomer menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin di pesan: ");
        int banyakItem = sc.nextInt();

        int totalHarga = HitungTotalHarga16(pilihanMenu, banyakItem);
        System.out.println("Total Harga untuk pesanan Anda: Rp" + totalHarga);

    }
    
}
    

