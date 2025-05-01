package br.com.fiap.application.gateway;

import br.com.fiap.core.model.Livro;

import java.util.ArrayList;

public interface PesquisarLivroPeloAutorGateway {
    ArrayList<Livro> pesquisar(String autor);
}
