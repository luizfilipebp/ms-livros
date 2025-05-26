package br.com.fiap.infrastructure.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record LivroPutReqBody(
        @NotBlank(message = "Título é obrigatório")
        String titulo,
        @NotBlank(message = "Autor é obrigatório")
        String autor,
        @NotBlank(message = "Editora é obrigatório")
        String editora,
        @Positive(message = "Quantidade deve ser positiva")
        Integer quantidade
) {
}
