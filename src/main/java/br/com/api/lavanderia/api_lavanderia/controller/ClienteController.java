package br.com.api.lavanderia.api_lavanderia.controller;

import br.com.api.lavanderia.api_lavanderia.model.Cliente;
import br.com.api.lavanderia.api_lavanderia.model.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;


    @GetMapping
    public String bemVindo(){
        return "Cliente, aqui você pode: ";
    }

    @PostMapping
    public void salverCliente(@RequestBody Cliente cliente)
    {
        clienteRepository.save(cliente);
    }

    @GetMapping("/{buscarTodos}")
    public List<Cliente> BuscarCliente(){
        return clienteRepository.findAll();
    }
}
