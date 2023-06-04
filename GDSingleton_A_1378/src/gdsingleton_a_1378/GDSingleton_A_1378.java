/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gdsingleton_a_1378;

/**
 *
 * @author ASUS
 */
public class GDSingleton_A_1378 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Database db1 = Database.getInstance("MySql", "UAJY");
        Database db2 = Database.getInstance("PostgreSql", "UAJY");
        
        
        
    }
    
}
