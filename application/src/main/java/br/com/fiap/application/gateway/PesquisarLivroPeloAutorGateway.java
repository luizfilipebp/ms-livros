package br.com.fiap.application.gateway;

import br.com.fiap.core.model.Livro;

import java.util.ArrayList;
import java.util.List;

public interface PesquisarLivroPeloAutorGateway {
    List<Livro> pesquisar(String autor);
}
