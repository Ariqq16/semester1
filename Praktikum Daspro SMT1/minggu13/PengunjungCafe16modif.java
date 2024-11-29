package minggu13;
import java.util.Scanner;
public class PengunjungCafe16modif {
    public static void daftarPengunjung(String... namaPengnujung) {
        System.out.println("Daftar Nama Pengunjung: ");
        for (int i = 0; i < namaPengnujung.length; i++) {
            System.out.println("- " + namaPengnujung[i]);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
    }
}
