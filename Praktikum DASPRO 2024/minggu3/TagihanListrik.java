import java.util.Scanner;
public class TagihanListrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //tarif per kwh
        double tarif_per_kwh = 1500;
        
        //input jumlah penggunaan listrik
        System.out.print("Masukkan Jumlah Penggunaan Listrik (kwh): ");
        double penggunaanKwh = input.nextDouble();


        //menghitung total tagihan
        double totalTagihan = penggunaanKwh * tarif_per_kwh;

        boolean melebihiBatas = penggunaanKwh > 500;

        //output hasil
        System.out.println("Total Tagihan Listrik: Rp " + totalTagihan);
        System.out.println("Penggunaan melebihi 500kwh: " + melebihiBatas);

    }
}
