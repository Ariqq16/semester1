package minggu10;
import java.util.Scanner;

public class PesananKafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.println("=== DAFTAR MENU KAFE ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + " . " + menu[i]);
        }
        System.out.println("========================");

        System.out.print("\nMasukkan makanan dan minuman yang ingin dicari: ");
        String CariMakanan = sc.nextLine();

        boolean ditemukan = false;
        int index = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].toLowerCase().equals(CariMakanan.toLowerCase())) {
                ditemukan = true;
                index = i;
                break;
            }
        }
        if (ditemukan) {
            System.out.println("\nMakanan/minuman \"" + menu[index] + "\" tersedia di menu!");
            System.out.println("Ditemukan pada nomor menu: " + (index + 1));
        } else {
            System.out.println("\nMaaf, makanan/minuman \"" + CariMakanan + "\" tidak ada di menu.");
        }
    }
}
