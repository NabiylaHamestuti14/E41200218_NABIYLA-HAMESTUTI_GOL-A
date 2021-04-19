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
public class SelectionSort {
    public static void selectionSort(int[] arr){ 
        //perbandingan menggunakanmetode selection sort
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//mencari nilai index terendah 
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
    public static void main(String[] args){
        //deklarasi array
        int[] arr1 = {9,14,3,2,43,11,58,22};  
        //menampilkan data sebelum sorting
        System.out.println("Before Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(arr1);//sorting array menggunakan selection sort
        //menampilkan data sesudah sorting
        System.out.println("After Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
    }  
}  