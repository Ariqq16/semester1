package minggu6;
import java.util.Scanner;
public class Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1 = 28;
        int bil2 = 54;
        int bil3 = 15;

        int terbesar = bil1;

        if (bil2 > terbesar) {
            terbesar = bil2;
        }

        if (bil3 > terbesar) {
            terbesar = bil3;
        }

        System.out.println("Bilangan Terbesar: " + terbesar);
    }
}
