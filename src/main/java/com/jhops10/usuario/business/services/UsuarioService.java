package com.jhops10.usuario.business.services;

import com.jhops10.usuario.business.converter.UsuarioConverter;
import com.jhops10.usuario.business.services.dto.UsuarioDTO;
import com.jhops10.usuario.infrastructure.entities.Usuario;
import com.jhops10.usuario.infrastructure.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        usuario = usuarioRepository.save(usuario);
        return usuarioConverter.paraUsuarioDTO(usuario);
    }
}
