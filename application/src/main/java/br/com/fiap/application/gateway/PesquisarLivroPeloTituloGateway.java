package br.com.fiap.application.gateway;

import br.com.fiap.core.model.Livro;
import br.com.fiap.core.model.Page;

import java.util.List;

public interface PesquisarLivroPeloTituloGateway {
    Page<Livro> pesquisar(String titulo, int numeroPagina, int tamanhoPagina);
}
