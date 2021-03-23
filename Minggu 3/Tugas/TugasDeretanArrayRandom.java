/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasderetanarrayrandom;

import java.util.Scanner;

/**
 *
 * @author Nabiyla Hamestuti
 */
public class TugasDeretanArrayRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] nomor;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Di Bawah Ini Merupakan Deretan Nomor Random yang Diinputkan = ");
        int r = scan.nextInt();
        nomor = new int[r];
        
        for (int i = 0; i < r; i++){
            System.out.print("Index Ke-" + i + " = ");
            nomor[i] = scan.nextInt();
        }
        System.out.println ("Jumlah Nomor Adalah" + " " + r);
        System.out.print("Nilai yang Diinputkan Adalah" + "( ");
        for(int nilai : nomor){
            System.out.print(nilai + " ");
        }
        System.out.print(")");
    }  
}
