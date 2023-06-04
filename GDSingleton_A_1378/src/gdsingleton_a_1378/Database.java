/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gdsingleton_a_1378;

/**
 *
 * @author Alfa
 */
public class Database {
    private static Database dbInstance = null;
    
    private String dbConn, dbName;

    public Database(String dbConn, String dbName) {
        this.dbConn = dbConn;
        this.dbName = dbName;
    }
    
    public static Database getInstance(String dbConn, String dbName){
        System.out.println("\nMembuat Objek database baru");
        
        if (dbInstance == null) {
            Database.dbInstance = new Database(dbConn, dbName);
            System.out.println("Objek Berhasil dibuat");
            System.out.println("dbConn : " + dbConn);
            System.out.println("dbName : " + dbName);
        }else{
            
            System.out.println("Objek gagal dibuat dibuat");
            System.out.println("sudah ada object sebelumnya");
            System.out.println("dbConn : " + dbConn);
            System.out.println("dbName : " + dbName);
        }
        
        return Database.dbInstance;
    }
}
