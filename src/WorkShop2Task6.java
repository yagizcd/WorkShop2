import java.util.*;

public class WorkShop2Task6 {
    public static void main(String[] args) {
    //6-) Günlük görevlerimizi içeren ve bu görevlerin tamamlanma
        // bilgisini tutan bir Arraylist oluşturunuz.
        // ArrayList içinde bulunan görevleri güncelleyen,
        //tamamlanan görevleri ise silen algoritmayı yazınız.


        List<HashMap<String, Object>> gunlukGorev = new ArrayList<>();


        HashMap<String,Object> gorev1 = new HashMap<>();
        gorev1.put("gorevAd","ISG Egitimi");
        gorev1.put("Tamamlanma",false);
        gunlukGorev.add(gorev1);

        HashMap<String,Object> gorev2 = new HashMap<>();
        gorev2.put("gorevAd","WorkShop2");
        gorev2.put("Tamamlanma",false);
        gunlukGorev.add(gorev2);

        HashMap<String,Object> gorev3 = new HashMap<>();
        gorev3.put("gorevAd","CRM Projesi");
        gorev3.put("Tamamlanma",false);
        gunlukGorev.add(gorev3);
        Scanner scanner = new Scanner(System.in);

        //if (kontrol == false)
        for (var gorev: gunlukGorev){
            System.out.println(gorev.get("gorevAd"));
            var kontrol =(boolean) gorev.get("Tamamlanma");
            if (kontrol == false)
                System.out.println("Tamamlanmadı");
            else
                System.out.println("Tamamlandı");
            System.out.println("----------------------");


        }
        int iterate = 0;
        for(var gorev: gunlukGorev){
            System.out.println((iterate+1)+". Gorev Adi degissin mi?");
            String evetHayir = scanner.next();
            evetHayir= evetHayir.toLowerCase();
            if (evetHayir.equals("evet")){
                System.out.println("Yeni görev adi:");
                String gorevAdiGuncelle = scanner.next();
                gorev.put("gorevAd",gorevAdiGuncelle);
            }
            else
                System.out.println("Gorev adi guncellenmedi");


            System.out.println("Gorev "+(iterate+1)+" tamamlandi mi?(Evet ya da hayir giriniz)");
            evetHayir = scanner.next();
            evetHayir= evetHayir.toLowerCase();
            if (evetHayir.equals("evet")) {
                gorev.put("Tamamlanma", true);
                System.out.println("Siliniyor");
            }
            else
                gorev.put("Tamamlanma",false);
            iterate++;

        }
        for (var gorev: gunlukGorev) {
            System.out.println(gorev.get("gorevAd"));
            var kontrol = (boolean) gorev1.get("Tamamlanma");
            if (kontrol == false)
                System.out.println("Tamamlanmadı");
            else
                System.out.println("Tamamlandı");
            System.out.println("----------------------");
        }

        List<HashMap<String, Object>> silinecekler = new ArrayList<>();
        for (var gorev: gunlukGorev){
            var kontrol = (boolean) gorev.get("Tamamlanma");
            if (kontrol == true)
                silinecekler.add(gorev);
        }
        if(silinecekler.isEmpty())
            System.out.println("Henüz biten bir görev yok");
        else {
            System.out.println("Tamamlanmayanlar Listesi:");
            gunlukGorev.removeAll(silinecekler);
            for (var gorev : gunlukGorev) {
                System.out.println(gorev.get("gorevAd"));
                var kontrol = (boolean) gorev.get("Tamamlanma");
                if (kontrol == false)
                    System.out.println("Tamamlanmadı");
                else
                    System.out.println("Tamamlandı");
                System.out.println("----------------------");
            }
        }

    }
}
