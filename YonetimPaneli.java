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
public class YonetimPaneli<T> {
    
    public void bilgileriGoster(T nesne){
        System.out.println(nesne);
    }
    
    public <T extends Musteri> void sahipOlduguHayvanlariGöster(T musteri){
        musteri.musteriHayvanlariniListele();
    }
    
    public void veterinerMusterileriniGoster(T veteriner){
        ((Veteriner)veteriner).musterileriListele();
    }
    
}
