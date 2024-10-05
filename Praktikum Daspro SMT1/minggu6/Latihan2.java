package minggu6;
import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String JenisBuku;
        int JumlahBuku;
        double diskon = 0;

        System.out.println("Masukkan Jenis buku: ");
        String jenisBuku = sc.nextLine();
        System.out.println("Masukkan jumlah buku yang dibeli: ");
        JumlahBuku = sc.nextInt();

        if(jenisBuku.equals("kamus")) {
            diskon = 0.10;
            if (JumlahBuku > 2) {
                diskon += 2;
            }
        }else if (jenisBuku.equals("novel")) {
            diskon = 0.7;
            if (JumlahBuku > 3 ) {
                diskon += 2;
            }else if (JumlahBuku <= 3) {
                diskon += 0.1;
            }
        }else {
            if (JumlahBuku > 3) {
                diskon = 0.5;
            }
        }

        System.out.println("Total diskon yang di berikan: " + diskon + "%");


        


    }
}
