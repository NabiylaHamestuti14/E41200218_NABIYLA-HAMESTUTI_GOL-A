/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author Nabiyla Hamestuti
 */
class  {
    int price;
    int pages;
    
    public void set (int price, int pages){
        this.price = price;
        this.pages = pages;
    }
    public void show (){
        System.out.println("Book Informaation");
        System.out.println("Books price : " +price);
        System.out.println("Number of pages : " +pages);
    }
}
public class Latihan3_Buku {
    public static void main(String[] args) {
        book javabook = new book();
        javabook.set(6000, 1000);
        javabook.show();
    }
}
