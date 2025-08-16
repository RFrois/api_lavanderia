package br.com.api.lavanderia.api_lavanderia.service;


import br.com.api.lavanderia.api_lavanderia.model.converter.ClienteConverter;
import br.com.api.lavanderia.api_lavanderia.model.dto.ClienteDto;
import br.com.api.lavanderia.api_lavanderia.model.entity.Cliente;
import br.com.api.lavanderia.api_lavanderia.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteConverter clienteConverter;

    public void inserir(ClienteDto clienteDto){
        clienteRepository.save((clienteConverter.toEntity(clienteDto)));
    }

    public List<ClienteDto> buscarTodos(){
        List<Cliente> clientes = clienteRepository.findAll();
        List<ClienteDto> clientesDto = new ArrayList<>();

        for (Cliente cliente : clientes) {
            ClienteDto dto = clienteConverter.toDTO(cliente);
            clientesDto.add(dto);
        }

        return clientesDto;
    }
}
