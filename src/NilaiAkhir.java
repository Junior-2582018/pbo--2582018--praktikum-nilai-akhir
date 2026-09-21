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

        input.close();
    }
}