package br.com.fiap.application.gateway;

import br.com.fiap.core.model.Livro;

import java.util.List;

public interface PesquisarLivroPeloIsbnGateway {
    List<Livro> pesquisar(String isbn);
}
