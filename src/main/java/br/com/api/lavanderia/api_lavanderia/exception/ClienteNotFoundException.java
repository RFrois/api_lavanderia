package br.com.api.lavanderia.api_lavanderia.exception;

public class ClienteNotFoundException extends RuntimeException{
    public ClienteNotFoundException(Long id){
        super("Cliente não encontrado com o ID: " + id);
    }
}
