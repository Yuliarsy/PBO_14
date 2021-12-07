/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobil;

/**
 *
 * @author Yulia Rakhmah
 */
public abstract class Mobil {
    
    public abstract double hitungBahanBakarMinimum();
    public abstract double hitungLamaPerjalanan();
    public void Hasil() {
        
        System.out.println("Perkiraan Bahan Bakar Minimal yang Diperlukan adalah : " + this.hitungBahanBakarMinimum());
        System.out.println("Perkiraan Lama Perjalanan yang Akan Ditempuh adalah : " + this.hitungLamaPerjalanan());
    }
}
