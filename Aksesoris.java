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
public class Aksesoris extends Fashion implements Gelang, Anting {

    private String warna;

    public void judul() {
        System.out.println("Aku hadir untuk membantu mempercantik penampilanmu");
    }

    public Aksesoris() {
        super.setNama("Bangle");
        super.setPemakaian("Pemakaian di Kaki");
        super.judul();
        this.judul();
        this.setWarna("Gold");

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

    @Override
    public void Emas() {
        System.out.println("Aku terbuat dari emas");
    }

    @Override
    public void Titanium() {
        System.out.println("Aku terbuat dari titanium");
    }

    @Override
    public void bulat() {
        System.out.println("Aku berbentuk bulat tanpa hiasan gantung");
    }

    @Override
    public void panjang() {
        System.out.println("Aku memiliki bentuk yang panjang dan memiliki hiasan gantung");
    }

    @Override
    public void tusuk() {
        System.out.println("Aku memiliki bentuk yang simple dengan penutup diujung");
    }

}
