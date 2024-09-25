import java.util.Scanner;
public class bahanbakar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Hargaperliter = 9000;
        double uangDiberikan, jumlahLiter;

        System.out.print("Masukkan Jumlah uang yang di berikan: ");
        uangDiberikan = sc.nextDouble();

        jumlahLiter = uangDiberikan / Hargaperliter;

        System.out.printf("jumlah liter bahan bakar yang di dapat: %.2f liter\n", jumlahLiter);
    }
}
