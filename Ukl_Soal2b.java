import java.util.Scanner;

public class Ukl_Soal2b {
    // Fungsi untuk menghitung volume tabung
    public static double hitungVolume(double jariJari, double tinggi) {
        return Math.PI * jariJari * jariJari * tinggi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari tabung (cm): ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi tabung (cm): ");
        double t = input.nextDouble();

        double volume = hitungVolume(r, t);

        System.out.println("Volume tabung adalah: " + volume + " cm³");

        input.close();
    }
}
