package br.com.fiap.application.gateway;

import br.com.fiap.core.model.Livro;
import br.com.fiap.core.model.Page;

public interface PesquisarLivroPeloAutorGateway {
    Page<Livro> pesquisar(String autor, int numeroPagina, int tamanhoPagina);
}
