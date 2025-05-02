package br.com.fiap.infrastructure.dto.response;

public record LivroPutResBody(
        String isbn,
        String titulo,
        String autor,
        String editora
) {
}
