/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolum_11_generics.veteriner_birligi;

import java.util.ArrayList;

/**
 *
 * @author Umut Burak Yenilmez
 */
public class Veteriner extends Kisi{

    private String mezunOlduguOkul;
    private int calismaSuresi;
    private ArrayList<Musteri> veterinerMusterileri;
    private int musteriSayisi;
    
    public Veteriner(String isim, String tcKimlik, String mezunOlduguOkul, int calismaSuresi) {
        super(isim, tcKimlik);
        this.mezunOlduguOkul = mezunOlduguOkul;
        this.calismaSuresi = calismaSuresi;
        veterinerMusterileri = new ArrayList<>();
        musteriSayisi = 0;
    }
    
    public void musteriEkle(Musteri musteri){
        veterinerMusterileri.add(musteri);
        musteriSayisi++;
    }
    
    public void musterileriListele(){
        for (Musteri m : veterinerMusterileri) {
            m.kendiniTanit();
        }
    }
    
    @Override
    void kendiniTanit() {
        System.out.println(toString() + " Ben bir veterinerim");
    }

    @Override
    public String toString() {
        return super.toString() + "Veteriner{" + "mezunOlduguOkul=" + mezunOlduguOkul + ", calismaSuresi=" + calismaSuresi + '}';
    }
    
    
    
}
