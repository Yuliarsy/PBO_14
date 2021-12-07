/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainClass;
import Mobil.MPV;
import Mobil.SUV;
import Mobil.Sedan;
/**
 *
 * @author Yulia Rakhmah
 */
public class MainClass {
    
    public static void main(String [] args) {
        
        Sedan sdn = new Sedan();
        SUV suv = new SUV();
        MPV mpv = new MPV() {};
        
        String[][] data = {
            {"A", "Sedan", "107", "60"},
            {"B", "Sedan", "538", "65"},
            {"C", "SUV", "662", "57"},
            {"D", "SUV", "471", "62"},
            {"E", "MPV", "541", "64"},
            {"F", "MPV", "433", "53"}
        };
        
        for(int i = 0; i <= data.length - 1; i++ ) {
            
            if(data[i][1] == "Sedan") {
                sdn.jarak = Double.parseDouble(data[i][2]);
                sdn.kecepatan = Double.parseDouble(data[i][3]);
                
                System.out.println("\nMobil " + data[i][0]);
                
                sdn.hitungBahanBakarMinimum();
                sdn.hitungLamaPerjalanan();
                sdn.Hasil();
                
            } else if(data[i][1] == "SUV") {
                suv.jarak = Double.parseDouble(data[i][2]);
                suv.kecepatan = Double.parseDouble(data[i][3]);
                
                System.out.println("\nMobil " + data[i][0]);
                
                suv.hitungBahanBakarMinimum();
                suv.hitungLamaPerjalanan();
                suv.Hasil();
                
            } else if(data[i][1] == "MPV") {
                mpv.jarak = Double.parseDouble(data[i][2]);
                mpv.kecepatan = Double.parseDouble(data[i][3]);
                
                System.out.println("\nMobil " + data[i][0]);
                
                mpv.hitungBahanBakarMinimum();
                mpv.hitungLamaPerjalanan();
                mpv.Hasil();
                
            }
        }
    }
}