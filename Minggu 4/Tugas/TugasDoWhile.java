/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasdowhile;

/**
 *
 * @author Nabiyla Hamestuti
 */
public class TugasDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //pendeklarasian variabel
        int i = 1;
        //mencetak tampilan header program
        System.out.println ("         Do While          ");
        System.out.println ("Bilangan Kelipatan 2 (1-100");
        System.out.println ("===========================");
        //code perulangan yang digunakan untuk menampilkan ouput program
        //menggunakan perulangan do while
        do {
            i = i * 2; //setiap nilai i selalu dikalikan 2 
            System.out.print (i + " ");
            if ( i == 64 )break ; //dibatasi hanya sampai dengan angka 64
        } while (true);
        }   
    }   

