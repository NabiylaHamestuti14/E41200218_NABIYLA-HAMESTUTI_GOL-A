/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasperulanganfor;

import java.util.Scanner;

/**
 *
 * @author Nabiyla Hamestuti
 */
public class TugasPerulanganFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //pendeklarasian variabel sekaligus membuat inputan
        Scanner input = new Scanner (System.in);
        int awal;
        int akhir;
        //code untuk menginputkan data
        System.out.print ("Batas Nilai Awal =" + " ");
        awal = input.nextInt();
        System.out.print ("Batas Nilai Akhir =" + " ");
        akhir = input.nextInt();
        //code perulangan untuk mendapatkan hasil bilangan genap dari terkecil hingga terbesar
        for (int i = 1; i <= 10; i++)
            if (i % 2 == 0) {
                System.out.print ( i + " ");
                
            }   
    }
}
