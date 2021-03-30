/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasnilaimaxmin;

import java.util.Scanner;

/**
 *
 * @author Nabiyla Hamestuti
 */
public class TugasNilaiMaxMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //membuat inputan sekaligus pendeklarasian varibabel
        Scanner m = new Scanner (System.in);
        int max, data, min, i, array[];
        int rata = 0;
        //code yang digunakan untuk memasukan berapa jumlah data nilai
        Scanner input = new Scanner (System.in);
        System.out.print ("Masukkan Data Nilai : ");
        data = m.nextInt ();
        array = new int[data];
        //code perulangan untuk memasukan tiap tiap nilai yang sesuai dengan jumlah data nilai
        for (i = 0; i < data; i++) {
            System.out.print ("Masukkan Data Nilai ke-" + (i + 1) + ": ");
            array[i] = m.nextInt();
        }
        max = array [0];
        min = array [0];
        //code untuk menentukan nilai maksimum dan nilai minimum
        for (i = 0; i < data; i++){
            if (array[i] > max){
                max = array[i];
            }   else if (array[i] < min) {
                min = array [i];
            }
        }
        //code untuk menentukan rata rata dari semua nilai yang diinputkan
        for (i = 0; i < data; i++) {
            rata += array [i];
        }
        rata = rata / i;
        //menampilkan footer dari program
        System.out.println ("---------------------------------");
        System.out.println (" Nilai Minimum = " + min);
        System.out.println (" Nilai Maksimum = " + max);
        System.out.println (" Nilai Rata-Rata = " + rata);
            }
            }
