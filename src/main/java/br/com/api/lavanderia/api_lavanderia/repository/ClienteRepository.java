package br.com.api.lavanderia.api_lavanderia.repository;

import br.com.api.lavanderia.api_lavanderia.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByFilial(int filial);
}
