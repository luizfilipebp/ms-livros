package br.com.fiap.application.gateway;

import br.com.fiap.core.model.Livro;

import java.util.List;
import java.util.Optional;

public interface PesquisarLivroPeloIsbnGateway {
    Optional<Livro> pesquisar(String isbn);
}
