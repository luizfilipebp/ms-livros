package br.com.fiap.usecase;

import br.com.fiap.core.model.Livro;

import java.util.List;
import java.util.Optional;

public interface PesquisarLivroPeloIsbnUseCase {
    Optional<Livro> pesquisar(String isbn);
}
