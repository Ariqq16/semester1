import java.util.Scanner;
public class Belanja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah barang yang di beli: ");
        int jumlahBarang = input.nextInt();
        System.out.print("Masukkan Harga satuan barang: ");
        double hargaSatuan = input.nextDouble();
        System.out.print("Masukkan jumlah uang yang diberikan pembeli: ");
        double uangDiberikan = input.nextDouble();

        double totalbelanja = jumlahBarang  * hargaSatuan;
        double kembalian = uangDiberikan - totalbelanja;

        System.out.println("\nTotal Belanja: Rp: " + totalbelanja);

        if (kembalian < 0) {
            System.out.println("Uang yang diberikan kurang sebesar: Rp " + Math.abs(kembalian));
        } else {
            System.out.println("Kembalian yang harus diberikan: Rp " + kembalian);
        }
    }
}
