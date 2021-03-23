/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanarray1dimensi;

/**
 *
 * @author Nabiyla Hamestuti
 */
public class LatihanArray1Dimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] angka = {5, 10, 17, 20, 1};
        String [] teks = {"Saya", "sedang", "belajar", "oop", "Java"};
        
        for (int i=0; i<angka.length; i++) {
            System.out.println(angka [i]);
        }
        
        for (int t=0; t<teks.length; t++){
            System.out.print(teks [t]);
            System.out.print(" ");
        }
    }
}
