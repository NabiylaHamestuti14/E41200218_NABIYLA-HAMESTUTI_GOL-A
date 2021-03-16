/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.b;

/**
 *
 * @author Yuangga Yuda Negara
 */
public class ManagingPeople {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p1;
        Person p2;
        p1 = new Person("Arial", 37);
        p2 = new Person("Joseph", 15);
        
        if(p1.getAge() == p2.getAge()){
            System.out.println(p1.getName() + " is the same age as " + p2.getName());
        } else {
            System.out.println(p1.getName() + " is NOT the same age as " + p2.getName());
        }
    }
}
