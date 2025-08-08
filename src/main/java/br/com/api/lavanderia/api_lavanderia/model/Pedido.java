package br.com.api.lavanderia.api_lavanderia.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id") // nome da coluna FK no banco
    private Cliente cliente;
    private String tipo;
    private String quantidade;
    private Double valor;

}
