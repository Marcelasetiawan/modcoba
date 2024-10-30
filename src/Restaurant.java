import java.util.ArrayList;
import java.util.Scanner;

class MenuItem {

    String name;
    double price;
    int quantity;
    String type;

    MenuItem(String name, double price, int quantity, String type) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.type = type;
    }

    double getTotalPrice() {
        return price * quantity;
    }

    String getDetails() {
        return String.format("%s (%s) - Rp%.2f x%d = Rp%.2f", name, type, price, quantity, getTotalPrice());
    }
}



public class Restaurant {
    private static final ArrayList<MenuItem> orderList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static final double TAX_RATE = 0.1; // Pajak 10%

    public static void main(String[] args) {
        System.out.println("Haloo, Selamat datang di Restoran Marcelaaaa!");
        System.out.println();

        boolean ordering = true;
        while (ordering) {
            System.out.print("Masukkan jenis (makanan/minuman): ");
            String type = scanner.nextLine();

            while (!type.equalsIgnoreCase("makanan") && !type.equalsIgnoreCase("minuman")) {
                System.out.print("Jenis tidak valid. Masukkan 'makanan' atau 'minuman': ");
                type = scanner.nextLine();
            }

            System.out.print("Masukkan nama " + type + ": ");
            String name = scanner.nextLine();

            System.out.print("Masukkan harga " + type + ": ");
            double price = scanner.nextDouble();

            System.out.print("Masukkan jumlah yang dipesan: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();  // Mengonsumsi newline

            orderList.add(new MenuItem(name, price, quantity, type));

            System.out.print("Apakah Anda ingin menambah pesanan? (y/n): ");
            String choice = scanner.nextLine();
            ordering = choice.equalsIgnoreCase("y");
        }

        printReceipt();
    }

    private static void printReceipt() {
        System.out.println("\n=== Nota Pemesanan ===");
        double totalCost = 0;

        for (MenuItem item : orderList) {
            System.out.println(item.getDetails());
            totalCost += item.getTotalPrice();
        }

        double tax = totalCost * TAX_RATE;
        double totalPayment = totalCost + tax;

        System.out.printf("\nSubtotal: Rp%.2f", totalCost);
        System.out.printf("\nPajak (10%%): Rp%.2f", tax);
        System.out.printf("\nTotal Pembayaran: Rp%.2f\n", totalPayment);
        System.out.println("Terima kasih telah memesan di Restoran kami!");
    }
}
