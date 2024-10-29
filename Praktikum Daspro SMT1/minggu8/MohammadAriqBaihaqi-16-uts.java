package minggu8;
import java.util.Scanner;
public class uts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //deklarasi variable
        int jumlah = 0;
        
        
        System.out.println("Masukkan Nilai N: ");
        int N = sc.nextInt();

        //menghitung kuadrat
        for(int i = 1; i <= N; i++){
            jumlah += i *i;
        }
        System.out.println("Jumlah: " + N + "bilangan kuadrat pertama adalah: " + jumlah);
            
        }
    }

