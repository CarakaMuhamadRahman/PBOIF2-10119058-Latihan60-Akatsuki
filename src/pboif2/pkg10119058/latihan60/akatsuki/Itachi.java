/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119058.latihan60.akatsuki;

/**
 *
 * @author 
 * NAMA      : Caraka Muhamad Rahman
 * KELAS     : PBOIF2
 * NIM       : 10119058
 * Deskripsi Program :  Program ini berisi program beberapa biodata anggota 
 *                      Akatsuki.
 */
public class Itachi extends Jutsu {
    private String clan;
    private String nama;
    
    public Itachi(String namaJutsu, String element, String damage) {
       super(namaJutsu,element,damage); 
    }
    public String getClan() {
        return clan;
    }
    public void setClan(String clan) {
        this.clan = clan;
    }
      public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void tampilClan() {
        System.out.println("Itachi adalah ninja dari desa Konohagakure, dia berasal dari clan " + clan + ".");
    }
}
