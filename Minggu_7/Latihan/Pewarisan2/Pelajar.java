/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pewarisan2;

/**
 *
 * @author Nabiyla Hamestuti
 */
public class Pelajar extends Orang{
    private String NIM;
    private String AsalKampus;
    private double Nilai;
    
    public Pelajar (String nama, double tinggi, double berat, String NIM, String kampus, double nilai) {
        super(nama, tinggi, berat);
        this.NIM = NIM;
        AsalKampus = kampus;
        this.Nilai = nilai;
    }
    public String toString() {
        return (super.toString()+"\nNIM :"+NIM+"\nAsal Kampus :"+AsalKampus+"\nNilai :"+Nilai);
    }
}
