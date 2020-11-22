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
 * Deskripsi Program : Program ini berisi program beberapa biodata anggota 
 *                     Akatsuki.
 */
public class PBOIF210119058Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=============================================BIODATA ANGOTA AKATSUKI====================================================");
        System.out.println();
        Itachi itachi = new Itachi("Amaterasu", "Api", "Api akan terus menyala jika lawan yang di hadapi blm hangus.");
        itachi.setNama("ITACHI");
        itachi.setClan("UCHIHA");
        System.out.println("--------------------" + itachi.getNama() + "---------------------");
        itachi.tampilClan();
        itachi.tampilHasil();
        System.out.println();
        Orochimaru orochimaru = new Orochimaru("Edo tensei", "Tanah" , "Mayat yang dihidupkan dari edo tensei hanya dapat dihentikan oleh ninja yang mengaktifkan jurusnya.");
        orochimaru.setNama("OROCHIMARU");
        orochimaru.setClan("OTOGAKURE");
        System.out.println("--------------------" + orochimaru.getNama() + "---------------------");
        orochimaru.tampilClan();
        orochimaru.tampilHasil();
        System.out.println();
        Nagato nagato = new Nagato("Chibaku tensei", "Tanah" , "Menarik segala sesuatu di sekitarnya untuk menciptakan semacam planet berukuran besar.");
        nagato.setNama("NAGATO");
        nagato.setClan("UZUMAKI");
        System.out.println("--------------------" + nagato.getNama() + "---------------------");
        nagato.tampilClan();
        nagato.tampilHasil();
    }
    
}
