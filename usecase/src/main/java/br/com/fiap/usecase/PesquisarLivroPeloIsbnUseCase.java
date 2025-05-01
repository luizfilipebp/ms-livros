package br.com.fiap.usecase;

import br.com.fiap.core.model.Livro;

public interface PesquisarLivroPeloIsbnUseCase {
    Livro pesquisar(String isbn);
}
