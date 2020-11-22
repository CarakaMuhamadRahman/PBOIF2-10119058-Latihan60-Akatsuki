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
public class Jutsu {
    protected String namaJutsu;
    protected String element;
    protected String damage;
    
    public Jutsu(String namaJutsu, String element, String damage) {
        this.namaJutsu = namaJutsu;
        this.element = element;
        this.damage = damage;
    }
    public void tampilHasil() {
        System.out.println("JUTSU   : " + namaJutsu);
        System.out.println("ELEMENT : " + element);
        System.out.println("DAMAGE  : " + damage);
    }
}
