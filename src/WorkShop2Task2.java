import java.util.Scanner;

public class WorkShop2Task2 {
    public static void main(String[] args) {

        String[] yemekler = {"Köfte", "Kebap", "Pilav", "Çorba", "Salata"};
        double[] fiyatlar = {15.0, 20.0, 10.0, 8.0, 5.0};
        double[] popülerlikDereceleri = {5, 4.50, 3.80, 4.20, 2.72};

        System.out.println("Menü:");
        for (int i = 0; i < yemekler.length; i++) {
            System.out.println((i+1) + ". " + yemekler[i] + " - " + fiyatlar[i] + " TL - Popülerlik: " + popülerlikDereceleri[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir yemek seçin (1-" + yemekler.length + "): ");
        int secim = scanner.nextInt();

        if (secim >= 1 && secim <= yemekler.length) {
            int index = secim - 1;
            System.out.println("Seçilen yemek: " + yemekler[index]);
            System.out.println("Fiyatı: " + fiyatlar[index] + " TL");
            System.out.println("Popülerlik: " + popülerlikDereceleri[index]);
        } else {
            System.out.println("Geçersiz seçim!");
        }
    }
}
