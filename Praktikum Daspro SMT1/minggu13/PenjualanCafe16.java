package minggu13;
import java.util.Scanner;

public class PenjualanCafe16 {
    // Data penjualan untuk 5 menu selama 7 hari
    static int[][] penjualan = {
        {20, 20, 25, 20, 10, 60, 10}, // Kopi
        {30, 80, 40, 10, 15, 20, 25}, // Teh
        {5, 9, 20, 25, 10, 5, 45},    // Es Degan
        {50, 8, 17, 18, 10, 30, 6},   // Roti Bakar
        {15, 10, 16, 15, 10, 10, 55}  // Gorengan
    };

    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

    // Fungsi untuk menginput data penjualan
    public static void inputDataPenjualan() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < penjualan.length; i++) {
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print("Masukkan penjualan " + menu[i] + " pada hari ke-" + (j + 1) + " : ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }

    // Fungsi untuk menampilkan seluruh data penjualan dari hari pertama hingga hari terakhir
    public static void tampilkanDataPenjualan() {
        System.out.println("Data Penjualan:");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + " : ");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk menampilkan Menu yang memiliki penjualan tertinggi
    public static void menuPenjualanTertinggi() {
        int totalTertinggi = 0;
        String menuTertinggi = "";

        for (int i = 0; i < penjualan.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            if (totalPenjualan > totalTertinggi) {
                totalTertinggi = totalPenjualan;
                menuTertinggi = menu[i];
            }
        }
        System.out.println("Menu dengan penjualan tertinggi: " + menuTertinggi + " dengan total penjualan " + totalTertinggi);
    }

    // Fungsi untuk menampilkan rata-rata penjualan untuk setiap menu
    public static void rataRataPenjualan() {
        System.out.println("Rata-rata Penjualan: ");
        for (int i = 0; i < penjualan.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rataRata = (double) totalPenjualan / penjualan[i].length;
            System.out.println(menu[i] + " : " + rataRata);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        // Menampilkan menu hingga pengguna memilih untuk keluar
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input Data Penjualan");
            System.out.println("2. Tampilkan Data Penjualan");
            System.out.println("3. Tampilkan Menu dengan Penjualan Tertinggi");
            System.out.println("4. Tampilkan Rata-rata Penjualan");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();

            // Menentukan pilihan
            if (pilihan == 1) {
                inputDataPenjualan();
            } else if (pilihan == 2) {
                tampilkanDataPenjualan();
            } else if (pilihan == 3) {
                menuPenjualanTertinggi();
            } else if (pilihan == 4) {
                rataRataPenjualan();
            } else if (pilihan == 5) {
                System.out.println("Keluar dari program.");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
