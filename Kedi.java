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
public class Kedi extends Hayvan{

    private String tur ;
    private String cinsi;
    
    public Kedi(String dogumTarihi, boolean kayitli, String cinsi) {
        super(dogumTarihi, kayitli);
        this.tur = "Kedi";
        this.cinsi = cinsi;
    }

    @Override
    void bilgileriGoster() {
        System.out.println(toString() + " kayitli mi: " + isKayitli() + " doğum tarihi : " + getDogumTarihi());
    }

    @Override
    public String toString() {
        return "Kedi{" + "tur=" + tur + ", cinsi=" + cinsi + '}';
    }
    
    
    
}
