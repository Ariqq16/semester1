import java.util.Scanner;
/**
 * BungaTabungan
 */
public class BungaTabungan {
    public static void main(String[] args) {
        double bungaTabungan;

        int saldoawal = 15000;
        double persenbunga = 0.2;
        int waktu = 10;

        bungaTabungan = (int) saldoawal*persenbunga*waktu;
        double saldoakhir = saldoawal + bungaTabungan;

        System.out.print(saldoakhir);
        
    }
}