/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Recoban10
 */
public class LaptopApp {
    public static void main(String[] args) {
        Laptop lp1 = new Laptop();
        System.out.println("Nama        : "+lp1.getNama());
        System.out.println("Brand       : "+lp1.getBrand());
        System.out.println("Processor   : "+lp1.getProcessor());
        System.out.println("Jumlah Core : "+lp1.getJumlahCore());
        System.out.println("OS          : "+lp1.getOS());
        System.out.println("RAM         : "+lp1.getRam());
        System.out.println("Storage     : "+lp1.getStorage());
        System.out.println("Stok        : "+lp1.getStok()+"\n");        
        Laptop laptop2 = new Laptop("Acer Aspire 14", "Acer", "Intel Core i5 7200u", 
                "2 Core", "Windows 10", "16GB", "SSD SATA", 2);
        System.out.println(laptop2);
    }
}
