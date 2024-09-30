package minggu5;
import java.util.Scanner;

public class Siakad16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim;
        String kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiAkhir, nilaiUjian;
    
        //meminta input dari pengguna
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
    
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble(); // Tambahkan input untuk nilai ujian

        // Menghitung nilaiAkhir
        nilaiAkhir = (nilaiKuis * 0.25) + (nilaiTugas * 0.35) + (nilaiUjian * 0.4);

        //menentukan nilai huruf dan kualifikasi
        String nilaiHuruf;
        String kualifikasi;

        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
            kualifikasi = "Nilai baik";
        } else if (nilaiAkhir >= 73) { 
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir >= 65) { 
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir >= 60) { 
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else {
            nilaiHuruf = "D";
            kualifikasi = "Gagal";
        }
        // Cetak hasil
        System.out.println("\nMahasiswa dengan nama" + nama + " (NIM " + nim + ") kelas " + kelas + "nomro absen" + absen);
        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai huruf: " + nilaiHuruf);
        System.out.println("kualifikasi: " + kualifikasi);
}
}