import java.util.Scanner;

class Star11Modifikasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " "); 
        }

        System.out.println();
        scanner.close();
    }
}