package br.com.fiap.application.usecaseimpl;

import br.com.fiap.application.gateway.PesquisarLivroPeloTituloGateway;
import br.com.fiap.core.model.Livro;

import java.util.List;

public class PesquisarLivroPeloTituloUseCaseImpl {
    private final PesquisarLivroPeloTituloGateway pesquisarLivroPeloTituloGateway;

    public PesquisarLivroPeloTituloUseCaseImpl(PesquisarLivroPeloTituloGateway pesquisarLivroPeloTituloGateway) {
        this.pesquisarLivroPeloTituloGateway = pesquisarLivroPeloTituloGateway;
    }

    public List<Livro> pesquisar(String titulo) {
        return pesquisarLivroPeloTituloGateway.pesquisar(titulo);
    }
}
