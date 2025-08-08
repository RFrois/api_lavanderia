package br.com.api.lavanderia.api_lavanderia.service;


import br.com.api.lavanderia.api_lavanderia.model.Cliente;
import br.com.api.lavanderia.api_lavanderia.model.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public void inserir(Cliente cliente){
        clienteRepository.save(cliente);
    }

    public List<Cliente> buscarTodos(){
        return clienteRepository.findAll();
    }
}
