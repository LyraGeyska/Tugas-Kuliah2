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
public class Pakaian extends Fashion implements Baju, Celana {

    private String warna;

    public void judul() {
        System.out.println("Aku hadir untuk membantu gaya busanamu");
    }

    public Pakaian() {
        super.judul();
        this.judul();
        this.setNama("Gamis");
        this.setWarna("Hitam");
        this.setPemakaian("Acara Formal");

    }

    @Override
    public void katun() {
        System.out.println("Aku berbahan katun yang terbuat dari serat kapas");
    }

    @Override
    public void polyester() {
        System.out.println("Aku berbahan polyester yang terbuat dari serat sintetis");
    }

    @Override
    public void rayon() {
        System.out.println("Aku berbahan rayon yang terbuat dari pengolahan ampas kayu");
    }

    @Override
    public void Panjang() {
        System.out.println("Aku bisa dipadu padankan dengan celana panjang");
    }

    @Override
    public void Pendek() {
        System.out.println("Aku bisa dipadu padankan dengan celana pendek");
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
