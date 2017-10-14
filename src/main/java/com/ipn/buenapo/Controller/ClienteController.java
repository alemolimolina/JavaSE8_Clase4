/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.buenapo.Controller;

import com.ipn.buenapo.ClienteDTO;
import com.ipn.buenapo.service.ClienteService;
import com.ipn.buenapo.service.implement.ClienteServiceImpl;
import javax.faces.bean.*;
/**
 *
 * @author AleAlejandro
 */

@ManagedBean
@RequestScoped
public class ClienteController {
    private ClienteDTO clienteDTO;
    
    private ClienteService clienteservice;

    public ClienteController(){
        clienteDTO = new ClienteDTO();
    }
    
    public ClienteDTO getCliente() {
        return clienteDTO;
    }
    
    public void setCliente(ClienteDTO cliente) {
        this.clienteDTO = cliente;
    }
    
    public void guardarCliente(){
        System.out.println(":::: GUARDANDO" + clienteDTO);
        
        System.out.println(clienteDTO.toString());
        clienteservice = new ClienteServiceImpl();
        System.out.println("====== GUARDANDO CLIENTE =======");
        clienteservice.crearNuevoCliente(clienteDTO);
        
        
    }
}


