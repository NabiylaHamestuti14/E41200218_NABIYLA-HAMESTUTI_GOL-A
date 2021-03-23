/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspercabanganelseif;

import java.util.Scanner;

/**
 *
 * @author Nabiyla Hamestuti
 */
public class TugasPercabanganElseIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("----------------------------------------");
        System.out.println("     Kharisma Agung Plaza < KAP>        ");
        System.out.println("       Promo Belanja Berhadiah          ");
        System.out.println("   Khusus Pembelian 5 Barang Pertama    ");
        System.out.println("Dengan Harga Minimal Belanja Rp. 100.000");
        System.out.println("----------------------------------------");
        
        String nama, hadiah;
        int [] price = new int [5];
        int jumlah = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Pembeli :");
        nama = scan.nextLine();
        System.out.print("Masukkan Harga Barang ke -1 :");
        price[0] = scan.nextInt();
        System.out.print("Masukkan Harga Barang ke -2 :");
        price[1] = scan.nextInt();
        System.out.print("Masukkan Harga Barang ke -3 :");
        price[2] = scan.nextInt();
        System.out.print("Masukkan Harga Barang ke -4 :");
        price[3] = scan.nextInt();
        System.out.print("Masukkan Harga Barang ke -5 :");
        price[4] = scan.nextInt();
        
        for (int i = 0; i<price.length; i++)
            jumlah = jumlah+price [i];
     
        System.out.println("Total Harga Pembelian Atas Nama" + " " + nama + " " + "adalah Rp."  + jumlah);   
        
        if (jumlah >= 100000){
            hadiah = "Selamat Anda Mendapatkan 1 Buah Mug";
        }else if (jumlah >= 90000){
            hadiah = "Selamat Anda Mendapatkan 1 Buah Piring";
        }else if (jumlah >= 80000){
            hadiah = "Selamat Anda Mendapatkan Kantong Belanja Gratis";
        }else if (jumlah >= 70000){
            hadiah = "Selamat Anda Mendapatkan Voucher Belanja Sebesar Rp. 3000";
        } else if (jumlah >= 60000){
            hadiah = "Selamat Anda Mendapatkan Kantong Belanja Gratis";
        } else {
            hadiah = "Maaf Anda tidak mendapatkan hadiah";
        } 
          System.out.println("");
          System.out.println(hadiah);
          
        //footer
        System.out.println("------------------------------------------");
        System.out.println("               Terima Kasih               ");
        System.out.println(" Anda sudah belanja di Kharisma Agung Plaza");
    }   
}
