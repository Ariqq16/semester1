package minggu8;
import java.util.Scanner;
public class PvZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int NyawaZombie = 70;
        int NyawaTanamanPelindung = 50;
        int nyawaTanamanPenyerang = 60;
        int SeranganZombie = 20;
        int SeranganTanamanPenyerang = 10;
        int ronde = 1;

        while (NyawaZombie>0&&nyawaTanamanPenyerang>0) {
            System.out.println("Ronde" + ronde);
            NyawaZombie = NyawaZombie - SeranganTanamanPenyerang;
            System.out.println("nyawa zombie: " + NyawaZombie);
            if (NyawaTanamanPelindung>0) {
                NyawaTanamanPelindung = NyawaTanamanPelindung - SeranganZombie;
            }else {
                nyawaTanamanPenyerang = nyawaTanamanPenyerang - SeranganZombie;
            }
            System.out.println("Nyawa Tanaman Pelindung: " + NyawaTanamanPelindung);
            System.out.println("Nyawa Tanaman Penyerang: " + nyawaTanamanPenyerang);
        }
        sc.close();
    }
}
