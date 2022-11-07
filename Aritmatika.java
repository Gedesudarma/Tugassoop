/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7;

/**
 *
 * @author 21102052/sudarma
 */
public class Aritmatika {
    //property
    private double hasil;
    
    //method tambah
    public void tambah(double bil1, double bil2){
        this.hasil = bil1 + bil2;
    }
    
    public void kurang(double bil1, double bil2){
        this.hasil = bil1 - bil2;
    }
    
    public void kali(double bil1, double bil2){
        this.hasil = bil1 * bil2;
    }
    
    public void bagi(double bil1, double bil2){
        if(bil2==0){
            
        }
        this.hasil = bil1 / bil2;
    }
    
    //get hasil
    public double getHasil(){
        return this.hasil;
    }
}

