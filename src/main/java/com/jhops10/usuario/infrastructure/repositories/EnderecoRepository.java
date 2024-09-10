package com.jhops10.usuario.infrastructure.repositories;

import com.jhops10.usuario.infrastructure.entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
