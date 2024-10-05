package minggu6;
import java.util.Scanner;
public class Latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String merk, kategori;
        int ukuran, harga = 0;

        System.out.println("Masukkan merk sepatu: ");
        merk = sc.nextLine();
        System.out.println("Masukkan kategori sepatu: ");
        kategori = sc.nextLine();
        System.out.println("Masukkan Ukuran Sepatu: ");
        ukuran = sc.nextInt();
        
        //input harga
        if (merk.equals("converse")) {
            if (kategori.equals("slip on") && ukuran >=36 && ukuran <= 40) {
                harga = 800000;
            } else if (kategori.equals("high top") && ukuran >=40 && ukuran <= 44) {
                harga = 120000000;
            }
        }else if (merk.equals("skecher")){
            if (kategori.equals("woman") && ukuran >= 36 && ukuran <= 41){
                harga = 1000000;
            } else if (kategori.equals("man") && ukuran >= 41 && ukuran <= 44){
                harga = 180000000;
            } else if (merk.equals("nike")) {
                if (kategori.equals("kids") && ukuran >= 36 && ukuran <= 40) {
                    harga = 750000;
                } else if (kategori.equals("adult") && ukuran >= 40 && ukuran <= 44 ) {
                    harga = 1500000;
                }
            }
        }
    
    //output harga sepatu
    if (harga != 0) {
        System.out.println("Harga sepatu: Rp " + harga);
    } else {
        System.out.println("sepatu dengan kombinasi tersebut tidak tersedia.");
    }
}
}   

   

