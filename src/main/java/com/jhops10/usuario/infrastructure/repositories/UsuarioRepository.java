package com.jhops10.usuario.infrastructure.repositories;

import com.jhops10.usuario.infrastructure.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    boolean existsByEmail(String email);
    Optional<Usuario> findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}
