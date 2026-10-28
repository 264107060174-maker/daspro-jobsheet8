import java.util.Scanner;

public class NilaiKelompok11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah kelompok: ");
        int jumlahKelompok = sc.nextInt();

        System.out.print("Masukkan jumlah penilaian: ");
        int jumlahPenilaian = sc.nextInt();

        if (jumlahKelompok <= 0 || jumlahPenilaian <= 0) {
            System.out.println("Jumlah kelompok dan jumlah penilaian harus lebih dari 0.");
        } else {
            int nomorKelompok = 0;
            double rataTertinggi = -1;
            int kelompokTerbaik = 0;

            while (nomorKelompok < jumlahKelompok) {
                System.out.println("Kelompok " + (nomorKelompok + 1));
                double totalNilai = 0;

                for (int i = 1; i <= jumlahPenilaian; i++) {
                    int nilai;
                    do {
                        System.out.print("Nilai dari Penilai " + i + ": ");
                        nilai = sc.nextInt();
                        if (nilai < 0 || nilai > 100) {
                            System.out.println("Nilai harus 0-100. Ulangi input!");
                        }
                    } while (nilai < 0 || nilai > 100);

                    totalNilai += nilai;
                }

                double rataNilai = totalNilai / jumlahPenilaian;
                System.out.println("Kelompok " + (nomorKelompok + 1)
                        + ": nilai rata-rata = " + rataNilai);

                if (rataNilai > rataTertinggi) {
                    rataTertinggi = rataNilai;
                    kelompokTerbaik = nomorKelompok + 1;
                }

                nomorKelompok++;
            }

            System.out.println("==============================");
            System.out.println("Kelompok terbaik : " + kelompokTerbaik);
            System.out.println("Rata-rata tertinggi : " + rataTertinggi);
        }

        sc.close();
    }
}
