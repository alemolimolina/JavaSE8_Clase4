/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.buanapo.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author AleAlejandro
 */
public class Conexion {
    Connection cn=null;
    
        public Connection returnConexion(){
        return cn;
    }
        
    public Connection Conecta() {
        System.out.println(":: Iniciando");
            try{
                Class.forName("com.mysql.jdbc.Driver").newInstance(); 
                cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemajava","root","");
                System.out.println("Conexion Exitosa");
            }
          catch(Exception e){
            System.out.println("Error");
            e.printStackTrace();
          
          }
        return cn;

        
    }
    
    
 
}

