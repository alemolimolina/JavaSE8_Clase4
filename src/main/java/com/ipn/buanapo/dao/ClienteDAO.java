/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.buanapo.dao;

import com.ipn.buenapo.ClienteDTO;

/**
 *
 * @author AleAlejandro
 */
public interface ClienteDAO {
    
    public void crearNuevoCliente(ClienteDTO clienteDTO);
    
    public void listarClientes();
    
    public ClienteDTO buscarClientePorCodigo(int codigo);
    
    public void actualizarCliente(ClienteDTO clienteDTO);
    
    public void borrarCliente(ClienteDTO clientedto);
    
    
                   
    
    
}
