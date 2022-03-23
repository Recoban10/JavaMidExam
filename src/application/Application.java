/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Recoban10
 */
import data.*;
public class Application {
    public static void main(String[] args) {
        
        Asus asus = new Asus("Asus TUF FX506LH", "Asus", "Intel i5-10300H", 
                "4", "Windows 10", "8", "SSD M.2", 5);
        System.out.println("Laptop Asus");
        System.out.println(asus);
        asus.getDisplay();
        asus.getGraphic();
        
        
        Acer acer = new Acer("Acer Swift 3", "Acer", "Intel Core i5-11300H", 
                "4", "Windows 10", "16", "SSD SATA", 4);
        System.out.println("\nLaptop Acer");
        System.out.println(acer);
        acer.getDisplay();
        acer.getGraphic();
    }
}
