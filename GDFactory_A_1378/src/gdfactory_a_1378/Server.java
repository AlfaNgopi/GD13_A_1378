/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gdfactory_a_1378;

/**
 *
 * @author Alfa
 */
public class Server extends Komputer{

    public Server(String merek, int ram, double cpu) {
        super(merek, ram, cpu);
    }

    @Override
    public void showData() {
        System.out.println("\n=== SERVER ===");
        System.out.println("Merek : " +merek);
        System.out.println("RAM : " + ram);
        System.out.println("CPU : " + cpu);
    }

}
