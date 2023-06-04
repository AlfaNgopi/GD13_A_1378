/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gdfactory_a_1378;

/**
 *
 * @author ASUS
 */
public class GDFactory_A_1378 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KomputerFactory kf = new KomputerFactory();
        
        Komputer komputer1 = kf.createKomputer("PC", "Lenovo", 8, 3.4);
        Komputer komputer2 = kf.createKomputer("Server", "Hp", 16, 4.2);
        Komputer komputer3 = kf.createKomputer("Laptop", "Asus", 16, 3.6);
        
        komputer1.showData();
        komputer2.showData();
        komputer3.showData();
    }
    
}
