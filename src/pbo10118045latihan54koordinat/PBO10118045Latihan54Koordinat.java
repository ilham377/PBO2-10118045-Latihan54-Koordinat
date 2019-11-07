/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan54koordinat;

/**
 *
 * @author
 *  Nama              : Muhammad Ilham Apriyadi
 *  Kelas             : IF2
 *  NIM               : 10118045
 *  Deskripsi Program : Koordinat
 */
public class PBO10118045Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat warna = new WarnaKoordinat(10,4,"Jingga");
        System.out.println("Warna Koordinat : "+warna.getNamaWarna());
        System.out.println("Koor dinat Sumbu X : "+warna.getX()+", y : "+warna.getY());
    }
    
}
