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
public class Asus extends Laptop{
    String display, storefront;
    
    public Asus(String nama, String brand, String processor, String jumlahCore, String OS, String Ram, String storage, int stok){
        super(nama, brand, processor, jumlahCore, OS, Ram, storage, stok);
        getStorefront();
        Stok();
    }

    public void Stok(){
        if (stok <= 0) {
            stok = 0;
        }
    }
    
    public String getStorefront() {
        if (storage == "SSD M.2") {
            storefront = "Best";
        } else if(storage == "SSD SATA"){
            storefront = "Good";
        } else if(storage == "HDD"){
            storefront = "Middle";
        } else {
            storefront = "Unknown";
        }
        return storefront;
    }
    
    public String getDisplay() {
        System.out.println("Display     : 15 Inch");
        return display;
    }
    
    public void getGraphic(){
        System.out.println("Graphic     : NVIDIA GeForce GTX 1650 4GB");
    }
    
    public String toString(){
        return "Nama        : "+nama
                +"\nBrand       : "+brand
                +"\nProcessor   : "+processor
                +"\nJumlah Core : "+jumlahCore
                +"\nOS          : "+OS
                +"\nRAM         : "+Ram
                +"\nStorage     : "+storage
                +"\nStorefront  : "+storefront
                +"\nStok        : "+stok;
    }
}
