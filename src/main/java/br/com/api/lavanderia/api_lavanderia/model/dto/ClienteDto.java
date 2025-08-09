package br.com.api.lavanderia.api_lavanderia.model.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteDto {

    private Long id;
    private String nome;
  //  private EnderecoDto endereco;
    private String telefone;
    private String email;

}
