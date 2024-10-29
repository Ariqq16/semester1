package minggu9;
import java.util.Scanner;
public class Porseni {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         String[] cabangOlahraga = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};
        int jumlahPoliteknik;
        
        System.out.print("Masukkan jumlah Politeknik yang mendaftar: ");
        jumlahPoliteknik = sc.nextInt();
        sc.nextLine(); // Membersihkan buffer input
        
        // Array untuk menyimpan nama atlet
        String[][][] atlet = new String[jumlahPoliteknik][cabangOlahraga.length][5];

        // Memasukkan data atlet
        for (int i = 0; i < jumlahPoliteknik; i++) {
            System.out.println("\nPoliteknik ke-" + (i + 1) + ":");
            for (int j = 0; j < cabangOlahraga.length; j++) {
                System.out.println("Cabang olahraga " + cabangOlahraga[j] + ":");
                for (int k = 0; k < 5; k++) {
                    System.out.print("Masukkan nama atlet ke-" + (k + 1) + ": ");
                    atlet[i][j][k] = sc.nextLine();
                }
            }
        }

        // Menampilkan data atlet
        System.out.println("\nInformasi Nama Atlet:");
        for (int i = 0; i < jumlahPoliteknik; i++) {
            System.out.println("\nPoliteknik ke-" + (i + 1) + ":");
            for (int j = 0; j < cabangOlahraga.length; j++) {
                System.out.println("Cabang olahraga " + cabangOlahraga[j] + ":");
                for (int k = 0; k < 5; k++) {
                    System.out.println("Atlet ke-" + (k + 1) + ": " + atlet[i][j][k]);
                }
            }
        }
    }
}
