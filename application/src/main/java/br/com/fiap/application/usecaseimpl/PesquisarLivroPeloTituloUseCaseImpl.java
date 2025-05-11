package br.com.fiap.application.usecaseimpl;

import br.com.fiap.application.gateway.PesquisarLivroPeloTituloGateway;
import br.com.fiap.core.model.Livro;
import br.com.fiap.core.model.Page;
import br.com.fiap.usecase.PesquisarLivroPeloTituloUseCase;

public class PesquisarLivroPeloTituloUseCaseImpl implements PesquisarLivroPeloTituloUseCase {
    private final PesquisarLivroPeloTituloGateway pesquisarLivroPeloTituloGateway;

    public PesquisarLivroPeloTituloUseCaseImpl(PesquisarLivroPeloTituloGateway pesquisarLivroPeloTituloGateway) {
        this.pesquisarLivroPeloTituloGateway = pesquisarLivroPeloTituloGateway;
    }

    @Override
    public Page<Livro> pesquisar(String titulo, int numeroPagina, int tamanhoPagina) {
        return pesquisarLivroPeloTituloGateway.pesquisar(titulo, numeroPagina, tamanhoPagina);
    }
}
