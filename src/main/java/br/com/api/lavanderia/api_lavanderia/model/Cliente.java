package br.com.api.lavanderia.api_lavanderia.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Cliente {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "cep", referencedColumnName = "cep")
//    private Endereco endereco;
    @NotNull
    private String telefone;
    private String email;

}
