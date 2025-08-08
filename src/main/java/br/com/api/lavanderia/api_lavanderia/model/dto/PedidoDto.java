package br.com.api.lavanderia.api_lavanderia.model.dto;

import br.com.api.lavanderia.api_lavanderia.model.entity.Cliente;
import lombok.Data;

@Data
public class PedidoDto {

    private long id;
    private Cliente cliente;
    private String tipo;
    private String quantidade;
    private Double valor;
}
