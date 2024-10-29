package minggu9;
import java.util.Scanner;
public class RataNilai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j;
        float TotalNilai, nilaiMhs, RataNilai;

            i = 5;
            while (i<=5) {
                TotalNilai = 0;
                for(j=1; j<=5; j++) {
                    System.out.print("Nilai ke-" + j + " = ");
                    nilaiMhs = sc.nextInt();
                    TotalNilai += nilaiMhs;
                }
                RataNilai=TotalNilai/5;
                i++;
            }
        }
    }

