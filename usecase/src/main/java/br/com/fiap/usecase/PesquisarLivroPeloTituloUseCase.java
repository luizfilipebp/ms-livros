package br.com.fiap.usecase;

import br.com.fiap.core.model.Livro;
import br.com.fiap.core.model.Page;

public interface PesquisarLivroPeloTituloUseCase {
    Page<Livro> pesquisar(String titulo, int numeroPagina, int tamanhoPagina);
}
