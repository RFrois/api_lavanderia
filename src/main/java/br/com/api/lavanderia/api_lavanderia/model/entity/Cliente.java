package br.com.api.lavanderia.api_lavanderia.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Cliente {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonProperty("nome")
    private String nome;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "cep", referencedColumnName = "cep")
//    private Endereco endereco;
    @JsonProperty("telefone")
    @NotNull
    private String telefone;
    @JsonProperty("email")
    private String email;

}
