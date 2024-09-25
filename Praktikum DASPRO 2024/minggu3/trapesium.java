import java.util.Scanner;
public class trapesium {
    public static void main(String[] args) {
        double ab, cd, miring, kel, t;
        Scanner sc = new Scanner(System.in);

        System.out.print("Panjang AB adalah: ");
        ab = sc.nextDouble();
        System.out.print("Panjang CD adalah: ");
        cd = sc.nextDouble();
        System.out.print("Tinggi adalah: ");
        t = sc.nextDouble();

        miring = Math.sqrt((t*t)+(ab-cd)*(ab-cd)/2);

        kel = ab+cd+miring*2;

        System.out.println("Keliling Trapesium Tersebut adalah" +kel);


    }
}
