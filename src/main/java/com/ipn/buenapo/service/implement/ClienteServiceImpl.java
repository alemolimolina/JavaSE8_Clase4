/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.buenapo.service.implement;

import com.ipn.buanapo.dao.ClienteDAO;
import com.ipn.buanapo.dao.impl.ClienteDAOImpl;
import com.ipn.buenapo.ClienteDTO;
import com.ipn.buenapo.service.ClienteService;

/**
 *
 * @author AleAlejandro
 */
public class ClienteServiceImpl implements ClienteService {

     private ClienteDAO clientedao;
     
    @Override
    public void crearNuevoCliente(ClienteDTO clienteDTO) {
     clientedao = new ClienteDAOImpl();
     clientedao.crearNuevoCliente(clienteDTO);
    }

    @Override
    public void listarClientes() {
       clientedao = new ClienteDAOImpl();
    }

    @Override
    public ClienteDTO buscarClientePorCodigo(int codigo) {
       clientedao = new ClienteDAOImpl();
       return clientedao.buscarClientePorCodigo(codigo);
      
    }

    @Override
    public void actualizarCliente(ClienteDTO clienteDTO) {
      clientedao = new ClienteDAOImpl();  
      clientedao.actualizarCliente(clienteDTO);
        
    }

    @Override
    public void borrarCliente(ClienteDTO clientedto) {
        clientedao = new ClienteDAOImpl();
        clientedao.borrarCliente(clientedto);
    }
    
}
