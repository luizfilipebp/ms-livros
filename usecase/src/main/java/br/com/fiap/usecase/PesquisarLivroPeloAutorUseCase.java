package br.com.fiap.usecase;

import br.com.fiap.core.model.Livro;

import java.util.List;

public interface PesquisarLivroPeloAutorUseCase {
    List<Livro> pesquisar(String autor);
}
