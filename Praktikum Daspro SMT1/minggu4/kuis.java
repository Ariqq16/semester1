package minggu4;
import java.util.Scanner;

public class kuis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double beratBadan;
        int durasiBerlari, durasiBerenang, durasiBersepeda;
        double koofisiensiBerlari = 0.05, koofisiensiBerenang = 0.04, koofisiensiBersepeda = 0.03;
        double kecepatanRatarataBerlari, kecepatanRatarataBerenang, kecepatanRatarataBersepeda;
        double ketinggianBerlari, ketinggianBerenang, ketinggianBersepeda;
        double targetKalori = 1000;

        //Menginput data yang diperoleh dari setiap aktivitas olahraga
        System.out.print("-----Berlari-----");
        System.out.print("Durasi: ");
        durasiBerlari = sc.nextInt();
        System.out.print("Berat badan: ");
        beratBadan = sc.nextDouble();
        kecepatanRatarataBerlari = sc.nextDouble();
        System.out.print("Ketinggian: ");
        ketinggianBerlari = sc.nextDouble();

        System.out.print("-----Berenang-----");
        System.out.print("Durasi: ");
        durasiBerenang = sc.nextInt();
        System.out.print("Berat badan: ");
        beratBadan = sc.nextDouble();
        kecepatanRatarataBerenang = sc.nextDouble();
        System.out.print("Ketinggian: ");
        ketinggianBerenang = sc.nextDouble();

        System.out.print("-----Bersepeda-----");
        System.out.print("Durasi: ");
        durasiBersepeda = sc.nextInt();
        System.out.print("Berat badan: ");
        beratBadan = sc.nextDouble();
        kecepatanRatarataBersepeda = sc.nextDouble();
        System.out.print("Ketinggian: ");
        ketinggianBersepeda = sc.nextDouble();

        //Menghitng kalori yang terbakar untuk setiap aktifitas olahraga

        //Berlari
        double KaloriBerlari = (durasiBerlari*koofisiensiBerlari*beratBadan)+(kecepatanRatarataBerlari*0.5)+(ketinggianBerlari*0.01);
        //Berenang
        double KaloriBerenang = (durasiBerenang*koofisiensiBerenang*beratBadan)+(kecepatanRatarataBerenang*0.5)+(ketinggianBerenang*0.01);
        //Bersepeda
        double KaloriBersepeda = (durasiBersepeda*koofisiensiBersepeda*beratBadan)+(kecepatanRatarataBersepeda*0.5)+(ketinggianBersepeda*0.01);

        //Hasil Menghitung total kalori
        System.out.println("Total kalori dari semua aktivitas olahraga: " +TotalKalori+ "kalori");

        //Menghitung total rata-rata kalori yang terbakar per-menit
        System.out.println("Rata-rata kalori yang terbakar permenit: " +rataratakalori+ "menit");

        //Hasil menghitung total kalori yang terbakar permenit
        System.out.println("Rata-rata kalori yang terbakar permenit: " +rataratakalori+ "");




        
        

    }
}









