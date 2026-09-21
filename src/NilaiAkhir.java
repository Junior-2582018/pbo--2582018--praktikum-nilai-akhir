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

        // (int) memotong bagian desimal, bukan melakukan pembulatan matematika.
        int dibulatkan = (int) akhir;
        double selisih = akhir - dibulatkan;
        boolean lulus = akhir >= 60;

        System.out.println();
        System.out.println("===== NILAI AKHIR =====");
        System.out.println("Praktikum : " + praktikum + "  (30%)");
        System.out.println("Tugas     : " + tugas + "  (20%)");
        System.out.println("MID       : " + mid + "  (20%)");
        System.out.println("Final     : " + finalNilai + "  (30%)");

        System.out.println();
        System.out.println("Nilai akhir  : " + akhir);
        System.out.println("Dibulatkan   : " + dibulatkan);
        System.out.println("Selisih      : " + selisih);
        System.out.println("Lulus (>=60) : " + lulus);
        input.close();
    }
}