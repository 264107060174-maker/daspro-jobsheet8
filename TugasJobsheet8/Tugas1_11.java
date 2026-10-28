package TugasJobsheet8;
import java.util.Scanner;

public class Tugas1_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = input.nextInt();

        while (n < 1) {
            System.out.print("n minimal 1. Masukkan kembali nilai n = ");
            n = input.nextInt();
        }

        int total = 0;
        for (int baris = 1; baris <= n; baris++) {
            for (int angka = 1; angka <= baris; angka++) {
                System.out.print(angka);
                total++; 
                if (angka < baris) {
                    System.out.print(" "); 
                }
            }
            System.out.println();
        }

        System.out.println("Total angka tercetak: " + total);
        input.close();
    }
}