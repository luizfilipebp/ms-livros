package br.com.fiap.infrastructure.dto.request;

import jakarta.validation.constraints.NotBlank;

public record LivroPutReqBody(
        @NotBlank(message = "Título é obrigatório")
        String titulo,
        @NotBlank(message = "Autor é obrigatório")
        String autor,
        @NotBlank(message = "Editora é obrigatório")
        String editora
) {
}
