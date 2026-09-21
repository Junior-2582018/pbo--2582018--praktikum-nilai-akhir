import java.util.Scanner;

public class NilaiAkhir {

    static final double BOBOT_PRAKTIKUM = 0.30;
    static final double BOBOT_TUGAS = 0.20;
    static final double BOBOT_MID = 0.20;
    static final double BOBOT_FINAL = 0.30;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Nilai praktikum : ");
        double praktikum = input.nextDouble();

        System.out.print("Nilai tugas     : ");
        double tugas = input.nextDouble();

        System.out.print("Nilai MID       : ");
        double mid = input.nextDouble();

        System.out.print("Nilai final     : ");
        double finalNilai = input.nextDouble();
        /*
         * Jika semua variabel bertipe int dan menggunakan rumus:
         * praktikum * 30 / 100 + tugas * 20 / 100
         * dan seterusnya, hasilnya menjadi 78, bukan 79,1.
         * Hal ini terjadi karena pembagian int membuang bagian desimal.
         */

// Kurung tidak diperlukan karena * dikerjakan lebih dulu daripada +.
        double akhir = praktikum * BOBOT_PRAKTIKUM
                + tugas * BOBOT_TUGAS
                + mid * BOBOT_MID;

        akhir += finalNilai * BOBOT_FINAL;

        input.close();
    }
}