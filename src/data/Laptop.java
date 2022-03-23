/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;

/**
 *
 * @author Recoban10
 */

public class Laptop {
    String nama, brand, processor, jumlahCore, OS,storage,Ram;
    int stok;
    
    Scanner input = new Scanner(System.in);
    
    public String toString(){
        return "Nama        : "+nama
                +"\nBrand       : "+brand
                +"\nProcessor   : "+processor
                +"\nJumlah Core : "+jumlahCore
                +"\nOS          : "+OS
                +"\nRam         : "+Ram
                +"\nStorage     : "+storage
                +"\nStok        : "+stok+"\n";
    }    
    public Laptop(){
         this.setNama();
        this.setBrand();
        this.setProcessor();
        this.setJumlahCore();
        this.setOS();
        this.setRam();
        this.setStorage();
        this.setStok();
    }
    
    public Laptop(String nama, String brand, String processor, String jumlahCore, String OS, String Ram, String storage, int stok){
        this.nama = nama;
        this.brand = brand;
        this.processor = processor;
        this.jumlahCore = jumlahCore;
        this.OS = OS;
        this.Ram = Ram;
        this.storage = storage;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public void setNama() {
        System.out.print("Nama        : ");
        this.nama = input.nextLine();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand() {
        System.out.print("Brand       : ");
        this.brand = input.nextLine();
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor() {
        System.out.print("Processor   : ");
        this.processor = input.nextLine();
    }

    public String getOS() {
        return OS;
    }

    public void setOS() {
        System.out.print("OS          : ");
        this.OS = input.nextLine();
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage() {
        System.out.print("Storage     : ");
        this.storage = input.nextLine();
    }

    public String getJumlahCore() {
        return jumlahCore;
    }

    public void setJumlahCore() {
        System.out.print("Jumlah Core : ");
        this.jumlahCore = input.nextLine();
    }

    public String getRam() {
        return Ram;
    }

    public void setRam() {
        System.out.print("RAM         : ");
        this.Ram = input.nextLine();
    }

    public int getStok() {
        return stok;
    }

    public void setStok() {
        System.out.print("Stok        : ");
        this.stok = input.nextInt();
    }
    
}
