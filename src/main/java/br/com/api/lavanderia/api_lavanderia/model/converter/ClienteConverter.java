package br.com.api.lavanderia.api_lavanderia.model.converter;

import br.com.api.lavanderia.api_lavanderia.model.dto.ClienteDto;
import br.com.api.lavanderia.api_lavanderia.model.entity.Cliente;
import br.com.api.lavanderia.api_lavanderia.repository.ClienteRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClienteConverter {

    private ClienteRepository clienteRepository;

    public ClienteDto toDTO(Cliente cliente){
        ClienteDto clienteDto = new ClienteDto();
        clienteDto.setId(cliente.getId());
        clienteDto.setNome(cliente.getNome());
        clienteDto.setTelefone(cliente.getTelefone());
        clienteDto.setEmail(cliente.getEmail());
        clienteDto.setFilial(cliente.getFilial());
      return clienteDto;
    }

    public Cliente toEntity(ClienteDto dto) {
        Cliente cliente = new Cliente();
        cliente.setNome(dto.getNome());
        cliente.setEmail(dto.getEmail());
        cliente.setTelefone(dto.getTelefone());
        cliente.setFilial(dto.getFilial());
        return cliente;
    }

    public List<ClienteDto> toDTOList(List<Cliente> clientes) {
        List<ClienteDto> clientesDto = new ArrayList<>();
        for (Cliente cliente : clientes) {
            clientesDto.add(toDTO(cliente));
        }
        return clientesDto;
    }

}
