/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu_6;

import java.util.Scanner;

/**
 *
 * @author Nabiyla Hamestuti
 */
public class BinarySearch {
    public static int[] data = null;
    public static int atas, tengah, bawah, temp, count;
    
    public static void main(String[] args) {
    //membuat objek scanner
        Scanner input = new Scanner(System.in);
        
    //memasukan jumlah data yang akan di sorting
        System.out.print("Masukkan Jumlah Data : ");
        int jumlah = input.nextInt();
    
    //memasukkan tiap tiap nilai sesuai dengan jumlah data yang sudah di inputkan
        data = new int[jumlah];
        for(int i = 0; i < data.length; i++){
            System.out.print("Masukkan Nilai ke-" + (i+1) + " = ");
            data[i] = input.nextInt();
        }
        //proses sorting
        sorting (); 
        //menampilkan data yang sudah di sorting
        System.out.println();
        System.out.print("Sorting : ");
        for(int i = 0; i < data.length; i++)
            System.out.print(data[i] + " ");
        //memasukkan data yang ingin dicari
        System.out.print("\nNilai yang dicari : ");
        int search = input.nextInt();
        
        //proses pencarian data
        System.out.println();
        boolean read = false;
        atas = 0;
        bawah = data.length - 1;
        temp = 0;
        count = 0;
        while (read != true){
            tengah = (atas + bawah) / 2;
            if (data[tengah] == search){
                read = true;
                break;
            }
            else if(data[tengah] < search){
            atas = tengah + 1;
            }
            else if(data[tengah] > search){
            atas = tengah - 1;
            }
            //mengecek worst case 
            if(temp != data[tengah])
                temp = data[tengah];
            else 
                count++;
            if (count == 3)
                break;
        }
        //menampilkan data yang dicari 
            if(read == true)
                System.out.println("\nNilai " + search + " ditemukan pada index ke-" + tengah); //jika data ada
            else 
                System.out.println("\nNilai " + search + " tidak ditemukan"); //jika data tidak ada
    }
    //mengurutkan data dari yang terkecil ke yang terbesar (ascending)
    public static void sorting(){
        int temp = 0;
        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data.length; j++){
                if (i == j)
                    continue;
                else {
                    if (data[i] < data [j]){
                        temp = data[j];
                        data[j] = data[i];
                        data[i] = temp;
                    }
                }
            }
        }
    }
}
