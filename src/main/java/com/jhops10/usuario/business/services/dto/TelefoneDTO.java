package com.jhops10.usuario.business.services.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TelefoneDTO {

    private Long id;
    private String ddd;
    private String numero;
}
