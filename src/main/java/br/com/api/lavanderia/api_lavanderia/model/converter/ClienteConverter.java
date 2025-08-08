package br.com.api.lavanderia.api_lavanderia.model.converter;

import br.com.api.lavanderia.api_lavanderia.model.dto.ClienteDto;
import br.com.api.lavanderia.api_lavanderia.model.entity.Cliente;

public class ClienteConverter {

    public ClienteDto toDTO(Cliente cliente){
        return new ClienteDto();
    }
}
