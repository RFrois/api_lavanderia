package br.com.api.lavanderia.api_lavanderia.service;


import br.com.api.lavanderia.api_lavanderia.model.dto.ClienteDto;
import br.com.api.lavanderia.api_lavanderia.model.entity.Cliente;
import br.com.api.lavanderia.api_lavanderia.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public void inserir(ClienteDto clienteDto){
        Cliente cliente = new Cliente();
        cliente.setNome(clienteDto.getNome());
        cliente.setTelefone(clienteDto.getTelefone());
        cliente.setEmail(clienteDto.getEmail());
        clienteRepository.save(cliente);
    }

    public List<Cliente> buscarTodos(){
        return clienteRepository.findAll();
    }
}
