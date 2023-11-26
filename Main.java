/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolum_11_generics.veteriner_birligi;

/**
 *
 * @author Umut Burak Yenilmez
 */
public class Main {
    public static void main(String[] args) {
        
        ilkNesneleriOlustur();
        
        
        
        
    }

    private static void ilkNesneleriOlustur() {
       Kedi kedi = new Kedi("01-01-2016", true, "van kedisi");
       Kedi kedi2 = new Kedi("01-04-2016", false, "siyam");
       Kedi kedi3 = new Kedi("05-04-2016", true, "tekir");
        
       Kopek kopek = new Kopek("02-06-2018", true, 1, "Golden");
       Kopek kopek2 = new Kopek("01-02-2017", true, 2, "Dalmaçyalı");
       Kopek kopek3 = new Kopek("06-10-2016", true, 4, "Pitbull");
       
       Musteri m1 = new Musteri("emre", "123", "ankara");
       m1.musteriyeHayvanEkle(kedi);
       m1.musteriyeHayvanEkle(kopek);
       
       Musteri m2 = new Musteri("hasan", "234", "izmir");
       m2.musteriyeHayvanEkle(kedi2);
       m2.musteriyeHayvanEkle(kopek2);
       
       Musteri m3 = new Musteri("ali", "3456", "istanbul");
       m3.musteriyeHayvanEkle(kedi3);
       m3.musteriyeHayvanEkle(kopek3);
       
       Veteriner v1 = new Veteriner("ayşe", "456", "ankara", 1);
       v1.musteriEkle(m1);
       v1.musteriEkle(m2);
       
       Veteriner v2 = new Veteriner("fatma", "567", "ege", 4);
       v2.musteriEkle(m1);
       v2.musteriEkle(m3);
       
       Veteriner v3 = new Veteriner("hayriye", "678", "marmara", 2);
       v3.musteriEkle(m3);
       
       v1.musterileriListele();
       
       SehirVeterinerlikleri ankara = new SehirVeterinerlikleri("ankara");
       ankara.sehireVeterinerEkle(v1);
       ankara.sehireVeterinerEkle(v2);
       
       SehirVeterinerlikleri izmir = new SehirVeterinerlikleri("izmir");
       izmir.sehireVeterinerEkle(v3);
       
       ankara.sehirdekiToplamVeterinerSayisiniBul();
       izmir.sehirdekiToplamVeterinerSayisiniBul();
       
        System.out.println("yönetim paneli");
       YonetimPaneli<Hayvan> hayvanYonetimPaneli = new YonetimPaneli<>();
       hayvanYonetimPaneli.bilgileriGoster(kedi);
       hayvanYonetimPaneli.bilgileriGoster(kopek);
       
       YonetimPaneli<Musteri> musteriYonetimPaneli = new YonetimPaneli<>();
       musteriYonetimPaneli.bilgileriGoster(m1);
       
       musteriYonetimPaneli.sahipOlduguHayvanlariGöster(m1);
       
    }
}
