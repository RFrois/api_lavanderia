package br.com.api.lavanderia.api_lavanderia.controller;

import br.com.api.lavanderia.api_lavanderia.model.dto.ClienteDto;
import br.com.api.lavanderia.api_lavanderia.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;


    @GetMapping
    public String bemVindo(){
        return "Cliente, aqui você pode: ";
    }

    @PostMapping
    public void salvarCliente(@RequestBody ClienteDto dto){
        clienteService.inserir(dto);
    }

    @GetMapping("/todos")
    public List<ClienteDto> BuscarClientes(){
        return clienteService.buscarTodos();
    }

    @GetMapping("/filial/{filial}")
    public List<ClienteDto> BuscarPorFilial(@PathVariable int filial){
        return clienteService.buscarPorFilial(filial);
    }

    @GetMapping("/id/{id}")
    public ClienteDto buscarPorId(@PathVariable Long id) {return clienteService.buscarPorId(id);}
}
