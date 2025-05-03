package br.com.fiap.infrastructure.service;

import br.com.fiap.application.gateway.PesquisarLivroPeloIsbnGateway;
import br.com.fiap.core.model.Livro;
import br.com.fiap.infrastructure.mapper.LivroMapper;
import br.com.fiap.infrastructure.repository.LivroRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@AllArgsConstructor
public class PesquisarLivroPeloIsbnGatewayImpl implements PesquisarLivroPeloIsbnGateway {

    private final LivroRepository livroRepository;

    /**
     * Método para pesquisar um livro pelo ISBN.
     *
     * @param isbn o ISBN do livro a ser pesquisado
     * @return um Optional contendo o livro encontrado ou vazio se não encontrado
     */
    @Override
    public Optional<Livro> pesquisar(String isbn) {
        return livroRepository.findById(Livro.validarIsbn(isbn)).map(LivroMapper.INSTANCE::livroEntityToLivro);
    }
}
