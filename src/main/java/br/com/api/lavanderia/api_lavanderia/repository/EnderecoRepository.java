package br.com.api.lavanderia.api_lavanderia.repository;

import br.com.api.lavanderia.api_lavanderia.model.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, String> {
}
