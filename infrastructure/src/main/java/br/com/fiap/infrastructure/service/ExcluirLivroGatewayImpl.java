package br.com.fiap.infrastructure.service;

import br.com.fiap.application.gateway.ExcluirLivroGateway;
import br.com.fiap.core.model.Livro;
import br.com.fiap.infrastructure.repository.LivroRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ExcluirLivroGatewayImpl implements ExcluirLivroGateway {

    private final LivroRepository livroRepository;

    /**
     * Método para excluir um livro pelo ISBN.
     *
     * @param Isbn o ISBN do livro a ser excluído
     */
    @Override
    public void excluir(String Isbn) {
        livroRepository.delete(livroRepository.findById(Livro.validarIsbn(Isbn)).orElseThrow(() -> new RuntimeException("Livro não encontrado")));
    }
}
