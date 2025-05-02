package br.com.fiap.infrastructure.dto.request;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record LivroPostReqBody(
        @NotBlank(message = "ISBN é obrigatório")
        @Length(min = 10, max = 13, message = "ISBN deve ter entre 10 e 13 caracteres")
        String isbn,
        @NotBlank(message = "Título é obrigatório")
        String titulo,
        @NotBlank(message = "Autor é obrigatório")
        String autor,
        @NotBlank(message = "Editora é obrigatório")
        String editora
) {
}
