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
public class SUV extends Mobil {

    public double kecepatan;
    public double jarak;
    
    @Override
    public double hitungBahanBakarMinimum() {
        double BahanBakarMin = jarak / 12;
        return BahanBakarMin;
    }

    /**
     *
     * @return
     */
    @Override
    public double hitungLamaPerjalanan() {
        double waktu= jarak / kecepatan;
        return waktu;
    }
    
}