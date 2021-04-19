/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu_6;

/**
 *
 * @author Nabiyla Hamestuti
 */
public class Descending {
    public static void main(String[] args){
       //deklarasi array
        int data[] = {24, 12, 67, 22, 11, 78};
       //mencetak data sebelum diurutkan
       System.out.println("Array Sebelum Sorting : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
       //mengurutkan data dengan membandingkan nilai
       for (int i=0; i<data.length; i++)
           for (int j=0; j<data.length; j++)
               if (data[i]>data[j])
               {
                   int hasil=data[i];
                   data[i]=data[j];
                   data[j]=hasil;
               }
        //mencetak data yang sudah diurutkan secara descending
        System.out.println();
        System.out.print("Array Sesudah Sorting (Descending):\n");
        for (int j=0; j<data.length; j++)
            System.out.print(data[j] + " ");
}
}
