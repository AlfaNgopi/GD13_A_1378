/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gdfactory_a_1378;

/**
 *
 * @author Alfa
 */
public class KomputerFactory {

    public Komputer createKomputer(String jenis, String merek, int ram, double cpu){
        switch(jenis){
            case "Laptop"   : return new Laptop(merek,ram,cpu);
            case "PC"       : return new PC(merek,ram,cpu);
            case "Server"   : return new Server(merek,ram,cpu);
        }
        
        return null;
    }
}
