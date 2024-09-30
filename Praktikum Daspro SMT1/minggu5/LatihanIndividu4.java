package minggu5;
import java.util.Scanner;
public class LatihanIndividu4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int umur;
        System.out.println("Masukkan umur anda: ");
        umur = sc.nextInt();

        String kategori = "";
        if (umur >= 0 && umur <=12) {
            kategori = "anak";
        }else if (umur >=13 && umur <=19) {
            kategori = "Remaja";
        }else if (umur >=20 && umur <=64) {
            kategori = "Dewasa";
        }else if (umur > 65) {
            kategori = "Lansia";
        }else {kategori="input umur yang dberikan tidak valid"; };

        System.out.println("umur: " +umur);
        System.out.println("Kategori: " +kategori);
    }
}
