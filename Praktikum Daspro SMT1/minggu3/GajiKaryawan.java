import java.util.Scanner;
public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah jam kerja dan upah per jam
        System.out.print("Masukkan jumlah jam kerja: ");
        double jamKerja = input.nextDouble();
        
        System.out.print("Masukkan upah per jam: ");
        double upahPerJam = input.nextDouble();

        // Menghitung gaji sebelum bonus
        double gajiSebelumBonus = jamKerja * upahPerJam;

        // Menghitung bonus sebesar 10%
        double bonus = 0.10 * gajiSebelumBonus;

        // Menghitung total gaji sebelum pajak
        double totalSebelumPajak = gajiSebelumBonus + bonus;

        // Menghitung pajak sebesar 5%
        double pajak = 0.05 * totalSebelumPajak;

        // Menghitung gaji akhir setelah pajak
        double gajiAkhir = totalSebelumPajak - pajak;

        // Menampilkan hasil
        System.out.println("Gaji sebelum bonus: Rp " + gajiSebelumBonus);
        System.out.println("Bonus: Rp " + bonus);
        System.out.println("Gaji akhir setelah pajak: Rp " + gajiAkhir);
    }
}
