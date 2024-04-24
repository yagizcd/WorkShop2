import java.util.Scanner;

public class WorkShop2Task3 {
    public static void main(String[] args) {

        String[] urunler = {"Kalem", "Defter", "Silgi", "Bant"};
        double[] fiyatlar = {1.5, 3.0, 0.75, 2.5};
        int[] sepetMiktari = new int[urunler.length];

        Scanner scanner = new Scanner(System.in);


        System.out.println("Ürünleri sepete ekleyin:");
        for (int i = 0; i < urunler.length; i++) {
            System.out.print(urunler[i] + " fiyatı: " + fiyatlar[i] + " TL, adet: ");
            sepetMiktari[i] = scanner.nextInt();
        }


        double toplamFiyat = 0;
        System.out.println("Sepetinizdeki ürünler:");
        for (int i = 0; i < urunler.length; i++) {
            if (sepetMiktari[i] > 0) {
                System.out.println(urunler[i] + " - " + fiyatlar[i] + " TL x " + sepetMiktari[i] + " adet");
                toplamFiyat += fiyatlar[i] * sepetMiktari[i];
            }
        }
        System.out.println("Toplam fiyat: " + toplamFiyat + " TL");
    }
}
