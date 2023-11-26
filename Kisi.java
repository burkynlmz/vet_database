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
abstract public class Kisi {
    
    private String isim;
    private String tcKimlik;

    public Kisi(String isim, String tcKimlik) {
        this.isim = isim;
        this.tcKimlik = tcKimlik;
    }

    
    
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(String tcKimlik) {
        this.tcKimlik = tcKimlik;
    }
    
    abstract void kendiniTanit();
    
    @Override
    public String toString() {
        return "Kisi{" + "isim=" + isim + ", tcKimlik=" + tcKimlik + '}';
    }
    
    
    
}
