package br.com.api.lavanderia.api_lavanderia.repository;

import br.com.api.lavanderia.api_lavanderia.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
