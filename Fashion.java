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
public class Fashion{

    private String nama;
    private String pemakaian;

    public void judul() {
        System.out.println("Kesempurnaan bisa dimulai dengan memperhatikan penampilanmu");
    }

    public void Fashion() {
        System.out.println("Haloo aku bagian dari fashion loh");
    }


    /**
     * @return the pemakaian
     */
    public String getPemakaian() {
        return pemakaian;
    }

    /**
     * @param pemakaian the pemakaian to set
     */
    public void setPemakaian(String pemakaian) {
        this.pemakaian = pemakaian;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

}
