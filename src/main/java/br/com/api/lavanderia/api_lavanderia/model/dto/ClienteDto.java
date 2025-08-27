package br.com.api.lavanderia.api_lavanderia.model.dto;


import lombok.Data;

@Data
public class ClienteDto {

    private Long id;
    private String nome;
  //  private EnderecoDto endereco;
    private String telefone;
    private String email;
    private int filial;


}
