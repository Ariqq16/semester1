package minggu6;
import java.util.Scanner;
public class Pemilihan2Percobaan216 {
    public static void main(String[] args) {
    Scanner ariq = new Scanner(System.in);

    String menu, member, anotherString, qris;
    double harga = 0, diskon, total_bayar = 0;
    int pilihan_menu;

    System.out.println("-------------------------");
    System.out.println("==== MENU CAAFE JTI =====");
    System.out.println("-------------------------");
    System.out.println("1. Ricebowl");
    System.out.println("2. Ice Tea");
    System.out.println("3. Paket Bunding (Ricebowl +Ice Tea)");
    System.out.println("------------------------------------");
    System.out.print("Masukkan angka dari menu yang di pilih = ");
    pilihan_menu = ariq.nextInt();
    ariq.nextLine();
    System.out.print("Apakah punya member (y/n) ? = ");
    member = ariq.nextLine();
    System.out.print("Apakah menggunakan metode pembayaran QRIS (y/n): ");
    qris = ariq.nextLine();
    System.out.println("-----------------------------------");

    if (member.equalsIgnoreCase("y")) { 
        diskon = 0.10;
        System.out.println("Besar diskon = 10");
        if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("Harga ricebowl = " +harga);
        } else if (pilihan_menu == 2) {
            harga = 3000;
            System.out.println("Harga Ice tea = " + harga);
        } else if (pilihan_menu == 3) {
            harga = 15000;
            System.out.println("Harga Bundling = " + harga );
        } else {
            System.out.println("Masukkan pilihan menu dengan benar");
            return; 
        }

        // Menghitung total bayar setelah diskon
        total_bayar = harga - (harga * diskon);
        System.out.println("Total bayar setelah diskon = " + total_bayar);
    }

    else if (member.equalsIgnoreCase("n")) { 
       if (pilihan_menu == 1) {
        harga = 14000;
        System.out.println("Harga ricebowl = " + harga);
       
        } else if (pilihan_menu == 2) {
            harga = 3000;
            System.out.println("Harga ice tea = " + harga);

        }  else if (pilihan_menu == 3) {
            harga = 15000;
            System.out.println("Masukkan pilihan menu dengan benar");
            return; 
        }    
            
        //Menghitung total bayar
            System.out.println("Total_bayar = " + harga);

        } else {
            System.out.println("Mmber tidak valid");
        }
        if (qris.equalsIgnoreCase("y")) {
            total_bayar =- 1000;
            System.out.println("Mendapatkan potongan harga Rp 1000 karena menggunakan QRIS");
        } else if (qris.equalsIgnoreCase("n")){
            System.out.println("Tidak mendapatka Potongan QRIS");
        }
        System.out.println("Total harga yang harus anda bayarkan: " +  total_bayar);
        System.out.println("----------------------------------------");
    }
}








 




