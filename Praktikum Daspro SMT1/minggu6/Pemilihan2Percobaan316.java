package minggu6;
import java.util.Scanner;
public class Pemilihan2Percobaan316 {
    public static void main(String[] args) {
        Scanner ariq = new Scanner(System.in);

        String kategori;
        int gajiBersih;
        double pajak = 0, penghasilan = 0;

        System.out.print("Masukkan Kategori: ");
        kategori = ariq.nextLine();
        System.out.print("Masukkan Besarnya Penghasilan: ");
        penghasilan = ariq.nextDouble();

        if (kategori.equals("pekerja")) {
            if (penghasilan <= 2500000) {
                pajak = 0.1;
            }
            
        else if (penghasilan <= 3000000){
            pajak = 0.15; 
        }    
        else {
            pajak = 0.2;
        }
        gajiBersih = (int) (penghasilan - (pajak * penghasilan));
        System.out.print("Penghasilan Bersih: " + gajiBersih);
    }else if (kategori.equals("pebisnis")) {
        if (penghasilan <= 2000000)
        pajak = 0.15;
    else if (penghasilan <= 3500000)
        pajak = 0.2;
    else 
        pajak = 0.25;
    gajiBersih = (int) (penghasilan -(pajak * penghasilan));
    System.out.print("Penghasilan Bersih: " + gajiBersih);
    }else 
    System.out.println("Masukkan Kategori Salah: ");
    }
}
