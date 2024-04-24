import java.util.Scanner;
public class Workshop2Task1 {
    public static void main(String[] args) {
        //1-) Bir mağazanın günlük satış miktarını,
        // ürün adı ve fiyatını bir dizi olarak tutan
        // ve toplam
        // satış gelirini hesaplayan bir algoritma yazınız.
        // Ürün adı ve fiyatını bir dizi olarak tutuyoruz

        String[] urunler = {"Asus Notebook", "Apple Telefon", "Apple Kulaklık"};
        double[] fiyatlar = {15000.999, 250000.999, 10000.999};

        Scanner scanner = new Scanner(System.in);


        int[] satışMiktarları = new int[3];
        for (int i = 0; i < urunler.length; i++) {
            System.out.print(urunler[i] + " satış miktarı: ");
            satışMiktarları[i] = scanner.nextInt();
        }


        double toplamGelir = 0;
        for (int i = 0; i < urunler.length; i++) {
            toplamGelir += satışMiktarları[i] * fiyatlar[i];
        }

        System.out.println("Toplam satış geliri: " + toplamGelir);
     }
}
