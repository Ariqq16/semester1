package minggu13;
import java.util.Scanner;

public class Percobaan616 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.println("Masukkan Panjang");
        p = sc.nextInt();
        System.out.println("Masukkan Lebar");
        l = sc.nextInt();
        System.out.println("Masukkan Tinggi");
        t = sc.nextInt();

       
        L = hitungluas(p, l);
        System.out.println("Luas Persegi Panjang adalah: " + L);

        
        vol = hitungVolume(t, p, l);
        System.out.println("Volume Balok adalah: " + vol);
    }

    
    static int hitungluas(int pjg, int lb) {
        int luas = pjg * lb;
        return luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungluas(a, b) * tinggi;
        return volume;
    }
}
