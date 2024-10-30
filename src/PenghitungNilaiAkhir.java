import java.util.Scanner;

/**
 *
 */
public class PenghitungNilaiAkhir {
    private static final double BOBOT_UAS = 0.4;
    private static final double BOBOT_UTS = 0.3;
    private static final double BOBOT_TUGAS = 0.3;
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double nilaiTugas = inputNilai(scanner, "tugas");
        double nilaiUTS = inputNilai(scanner, "UTS");
        double nilaiUAS = inputNilai(scanner, "UAS");
        displayNilaiAkhir(hitungNilaiAkhir(nilaiTugas, nilaiUTS, nilaiUAS));
        scanner.close();
    }

    /**
     *
     * @param nilaiAkhir
     */
    private static void displayNilaiAkhir(double nilaiAkhir) {
        System.out.println("Nilai akhir mata kuliah Anda adalah: " + nilaiAkhir);
        if (nilaiAkhir >= 85) {
            System.out.println("Grade: A");
        } else if (nilaiAkhir >= 70) {
            System.out.println("Grade: B");
        } else if (nilaiAkhir >= 60) {
            System.out.println("Grade: C");
        } else if (nilaiAkhir >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: E");
        }
    }

    /**
     *
     * @param nilaiTugas
     * @param nilaiUTS
     * @param nilaiUAS
     * @return
     */
    private static double hitungNilaiAkhir(double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        return (nilaiTugas * BOBOT_TUGAS) + (nilaiUTS * BOBOT_UTS) + (nilaiUAS * BOBOT_UAS);
    }

    /**
     *
     * @param scanner
     * @param jenisNilai
     * @return
     */
    private static double inputNilai(Scanner scanner, String jenisNilai) {
        while (true) {
            try {
                System.out.print("Masukkan nilai " + jenisNilai + " (0-100): ");
                double nilai = Double.parseDouble(scanner.nextLine());

                if (nilai < 0 || nilai > 100) {
                    System.out.println("Error: Nilai harus antara 0 dan 100. Coba lagi.");
                }else {
                    return nilai;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Input harus berupa angka. Coba lagi.");
            }
        }
    }
}
