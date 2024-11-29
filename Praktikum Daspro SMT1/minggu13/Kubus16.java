package minggu13;
import java.util.Scanner;
public class Kubus16 {
    double sisi;

    public Kubus16(double sisi) {
        this.sisi = sisi;
    }

    //fungsi untuk menghitung volume kubus
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }

    //fungsi untuk menghitung luas permukaan kubus
    public double hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        Kubus16 kubus = new Kubus16(6);

        System.out.println("Volume Kubus: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());
    }

}
