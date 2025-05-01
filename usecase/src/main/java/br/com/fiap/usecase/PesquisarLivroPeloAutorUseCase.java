package br.com.fiap.usecase;

import br.com.fiap.core.model.Livro;

public interface PesquisarLivroPeloAutorUseCase {
    Livro pesquisar(String autor);
}
