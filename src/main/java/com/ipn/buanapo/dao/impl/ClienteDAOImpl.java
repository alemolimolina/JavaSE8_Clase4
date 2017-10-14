/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.buanapo.dao.impl;

import com.ipn.buanapo.dao.ClienteDAO;
import com.ipn.buanapo.dao.Conexion;
import com.ipn.buenapo.ClienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author AleAlejandro
 */
public class ClienteDAOImpl extends Conexion implements ClienteDAO {

    @Override
    public void crearNuevoCliente(ClienteDTO clienteDTO) {
        try {
        this.Conecta();
        String sqlInsert ="INSERT INTO cliente" + " (id) " +  "VALUES (?);";
        
        PreparedStatement st = null;
        st=this.returnConexion().prepareStatement(sqlInsert);
            System.out.println(sqlInsert);
          //  System.out.println(clienteDTO.getId());   
       
        st.setInt(1, clienteDTO.getId());
        //st.setString(2,clienteDTO.getNombre());
       // st.setString(3, clienteDTO.getApellido());
       // st.setString(4, clienteDTO.getPais());
       // st.setString(5, clienteDTO.getSexo());
        //System.out.println(st);
        st.executeUpdate();
        
        }
        catch(Exception e){
            e.printStackTrace();
            
        }
    }

    @Override
    public void listarClientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ClienteDTO buscarClientePorCodigo(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizarCliente(ClienteDTO clienteDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrarCliente(ClienteDTO clientedto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
