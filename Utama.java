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
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //PAKAIAN
        Pakaian gamis = new Pakaian();
        System.out.println("Aku adalah " + gamis.getNama());
        System.out.println("Aku berwarna " + gamis.getWarna());
        System.out.println("Aku bisa digunakan pada " + gamis.getPemakaian());
        gamis.rayon();
        gamis.Panjang();
        System.out.println("======================================================================================");

        //CASTING
        Fashion kemeja = (Fashion) gamis;
        System.out.println("Aku adalah kemeja, aku bisa juga bisa dipakai di " + kemeja.getPemakaian());

        System.out.println("======================================================================================");

        //AKSESORIS
        Aksesoris bangle = new Aksesoris();
        System.out.println("Aku adalah "+bangle.getNama());
        System.out.println("Aku berwarna "+bangle.getWarna());
        System.out.println("Aku biasanya digunakan di " +bangle.getPemakaian());
        bangle.Emas();
        bangle.panjang();
        
       
        //AKSESORIS
//        System.out.println("");
//        Aksesoris bangle = new Aksesoris();
//        System.out.println("Aku adalah " + bangle.getNama() + " yang berwarna "
//                + bangle.getWarna() + " yang bisa dipakai sehari-sehari."
//                + " Aku biasa dipakai di " + bangle.getPemakaian());
//        bangle.Emas();
//        bangle.panjang();

    }

}
