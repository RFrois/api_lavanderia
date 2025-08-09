package br.com.api.lavanderia.api_lavanderia.model.converter;

import br.com.api.lavanderia.api_lavanderia.model.dto.ClienteDto;
import br.com.api.lavanderia.api_lavanderia.model.entity.Cliente;
import org.springframework.stereotype.Component;

@Component
public class ClienteConverter {

    public ClienteDto toDTO(Cliente cliente){
      return new ClienteDto();
    }

    public Cliente toEntity(ClienteDto dto) {
        Cliente cliente = new Cliente();
        cliente.setNome(dto.getNome());
        cliente.setEmail(dto.getEmail());
        cliente.setTelefone(dto.getTelefone());
        return cliente;
    }

}
