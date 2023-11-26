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
public class SehirVeterinerlikleri {
    
    private String sehir;
    private int toplamVeterinerSayisi;
    private ArrayList<Veteriner> sehirdekiVeterinerler;

    public SehirVeterinerlikleri(String sehir) {
        this.sehir = sehir;
        sehirdekiVeterinerler = new ArrayList<>();
        toplamVeterinerSayisi = 0;
    }
    
    public void sehireVeterinerEkle(Veteriner veteriner){
        sehirdekiVeterinerler.add(veteriner);
        toplamVeterinerSayisi++;
    }
    
    public void sehirdekiToplamVeterinerSayisiniBul(){
        System.out.println("Toplam veteriner sayısı : " + sehirdekiVeterinerler.size());
    }
    
    
}
