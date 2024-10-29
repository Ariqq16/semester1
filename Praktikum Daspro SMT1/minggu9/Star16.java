package minggu9;
import java.util.Scanner;
public class Star16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan nilai N: ");
        int N = sc.nextInt();

        for(int i = 1; 1<=N; i++) {
            System.out.print("*");
        }
    }
}
