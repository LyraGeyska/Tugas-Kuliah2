/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author HP
 */
public class Pakaian extends Fashion implements Baju {

    private String jenisPakaian;
    private String warna;

    @Override
    public void katun() {
        System.out.println("Bahan katun terbuat dari serat kapas");
    }

    @Override
    public void polyester() {
        System.out.println("Bahan polyester terbuat dari serat sintetis");
    }

    @Override
    public void rayon() {
        System.out.println("Bahan rayon terbuat dari pengolahan ampas kayu");
    }
    
    public Pakaian(){
        System.out.println("Pakaian merupakan bagian dari Fashion.");
        this.setJenisPakaian("Gamis");
        this.setWarna("Hitam");
        super.setNama("Baju");
        super.setPemakaian("Acara Formal");
    }

    /**
     * @return the jenisPakaian
     */
    public String getJenisPakaian() {
        return jenisPakaian;
    }

    /**
     * @param jenisPakaian the jenisPakaian to set
     */
    public void setJenisPakaian(String jenisPakaian) {
        this.jenisPakaian = jenisPakaian;
    }

    /**
     * @return the warna
     */
    public String getWarna() {
        return warna;
    }

    /**
     * @param warna the warna to set
     */
    public void setWarna(String warna) {
        this.warna = warna;
    }
}
