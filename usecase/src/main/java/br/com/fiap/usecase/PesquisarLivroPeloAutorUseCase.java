package br.com.fiap.usecase;

import br.com.fiap.core.model.Livro;
import br.com.fiap.core.model.Page;

public interface PesquisarLivroPeloAutorUseCase {
    Page<Livro> pesquisar(String autor, int pageNumber, int pageSize);
}
