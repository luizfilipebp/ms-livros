package br.com.fiap.infrastructure.dto.response;

public record LivroPostResBody(
        String isbn,
        String titulo,
        String autor,
        String editora
) {
}
