package com.jhops10.usuario.infrastructure.repositories;

import com.jhops10.usuario.infrastructure.entities.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
