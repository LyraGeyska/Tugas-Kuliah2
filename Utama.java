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
        Pakaian gamis = new Pakaian();
        System.out.println("Aku adalah "+gamis.getJenisPakaian()+ " yang berwarna " 
                +gamis.getWarna()+ ". Aku merupakan " +gamis.getNama()+ "loh" + " sehari-sehari." 
                        + " Aku juga bisa dipakai di " +gamis.getPemakaian());
        gamis.rayon();
        
        System.out.println("");
        
        Aksesoris cincin = new Aksesoris();
        System.out.println("Aku adalah "+cincin.getNama()+ " Aku memiliki warna "+cincin.getWarna());
        System.out.println("");
        
        Fashion kemeja = (Fashion) gamis;
        System.out.println("Aku adalah kemeja, aku bisa juga bisa dipakai di "+kemeja.getPemakaian());
        
        
    }
    
}
