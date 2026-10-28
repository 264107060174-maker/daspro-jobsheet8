package TugasJobsheet8;
import java.util.Scanner;
public class Tugas2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n = "); 
        int n = input.nextInt();

    long jumlahSeluruhAngka = 0; 
    for (int baris = 1; baris <= n; baris++) {
        for (int kolom = 1; kolom <= n; kolom++) {
            long hasil = (long) baris * kolom; 
            System.out.printf("%4d", hasil); 
            jumlahSeluruhAngka += hasil; 
        }
        System.out.println(); 
    }

    System.out.println("Jumlah seluruh angka: " + jumlahSeluruhAngka); 
    input.close(); 
    }
}