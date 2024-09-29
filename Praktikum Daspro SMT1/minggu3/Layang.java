import java.util.Scanner;
public class Layang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int d1, d2;

        System.out.print("Masukkan d1: ");
        d1 = input.nextInt();
        System.out.print("Masukkan d2: ");
        d2 = input.nextInt();

        int d2_2=d2/2;
        int panjang = d1-(d2/2);;

        double pBenag= Math.sqrt((panjang*panjang)+(d2_2*d2_2));
        System.out.println("panjang benang adalah: " +pBenag);
        double luarkertas = (1/2f)*(d1*d2);
        System.out.println("luas adalah: " +luarkertas);


    }
}
