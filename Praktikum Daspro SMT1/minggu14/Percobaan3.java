package minggu14;
import java.util.Scanner;
public class Percobaan3 {
    static double hitunLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return (saldo);
        } else {
            return (1.11 * hitunLaba(saldo, tahun - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoAwal;
        int tahun;

        System.out.print("Jumlah saldo awal: ");
        saldoAwal = sc.nextInt();
        System.out.print("Lamanya investasi (tahun) :");
        tahun = sc.nextInt();

        System.out.print("Jumlah saldo setelah " + tahun + " tahun : ");
        System.out.print(hitunLaba(saldoAwal, tahun));
    }
}
