/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasswitch;

import java.util.Scanner;

/**
 *
 * @author Nabiyla Hamestuti
 */
public class TugasSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        String nomor;
        Scanner scan = new Scanner(System.in);
        
        System.out.println ("    NABIYLA CAFE    ");
        System.out.println ("    ANEKA MINUMAN   ");
        System.out.println ("--------------------");
        System.out.println ("    SPECIAL MENU    ");
        System.out.println ("   1. Minuman Dingin");
        System.out.println ("   2. Jus Buah      ");
        System.out.println ("   3. Kopi          ");
        System.out.println ("   4. Soda          ");
        System.out.println ("   5. Teh           ");
        System.out.println ("--------------------");
        
        System.out.print("Masukkan Nama Pembeli : ");
        nama = scan.nextLine();
        System.out.println(" ");
        System.out.print("Silahkan Masukkan Pilihan Anda : ");
        nomor = scan.nextLine();
        
        switch (nomor) {
            case "1":
                System.out.println("Minuman Yang Anda Pesan Adalah Minuman Dingin");
                break; 
            case "2":
                System.out.println("Minuman Yang Anda Pesan Adalah Jus Buah");
                break; 
            case "3":
                System.out.println("Minuman Yang Anda Pesan Adalah Kopi");
                break;
            case "4":
                System.out.println("Minuman Yang Anda Pesan Adalah Soda");
                break; 
            case "5":
                System.out.println("Minuman Yang Anda Pesan Adalah Teh");
                break; 
            default :
                System.out.println("Kode Yang Anda Masukkan Salah");
        }    
        System.out.println("Pesanan Akan Segera Kami Antar");
        System.out.println("Terimakasih" + " "+ nama + " " + "Telah Berkunjung di Nabiyla Cafe ");
    }
}
