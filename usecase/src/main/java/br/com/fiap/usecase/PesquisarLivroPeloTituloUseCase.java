package br.com.fiap.usecase;

import br.com.fiap.core.model.Livro;

public interface PesquisarLivroPeloTituloUseCase {
    Livro pesquisar(String titulo);
}
