/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gdfactory_a_1378;

/**
 *
 * @author Alfa
 */
public abstract class Komputer {
    protected String merek;
    protected int ram;
    protected double cpu;

    public Komputer(String merek, int ram, double cpu) {
        this.merek = merek;
        this.ram = ram;
        this.cpu = cpu;
    }
    
    public abstract void showData();
}
