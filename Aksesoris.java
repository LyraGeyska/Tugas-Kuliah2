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
public class Aksesoris extends Fashion {

    private String warna;
    private int ukuran;

    public Aksesoris(){
        System.out.println("Aksesoris merupakan bagian yang cukup penting pagi perempuan.");
        this.setWarna("Emas");
        this.setUkuran(12);
        super.setNama("Cincin");
        super.setPemakaian("Pemakaian di Jari");
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

    /**
     * @return the ukuran
     */
    public int getUkuran() {
        return ukuran;
    }

    /**
     * @param ukuran the ukuran to set
     */
    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

}
