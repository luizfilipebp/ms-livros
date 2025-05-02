package br.com.fiap.application.usecaseimpl;

import br.com.fiap.application.gateway.PesquisarLivroPeloAutorGateway;
import br.com.fiap.core.model.Livro;
import br.com.fiap.usecase.PesquisarLivroPeloAutorUseCase;

import java.util.List;

public class PesquisarLivroPeloAutorUseCaseImpl implements PesquisarLivroPeloAutorUseCase {
    private final PesquisarLivroPeloAutorGateway pesquisarLivroPeloAutorGateway;

    public PesquisarLivroPeloAutorUseCaseImpl(PesquisarLivroPeloAutorGateway pesquisarLivroPeloAutorGateway) {
        this.pesquisarLivroPeloAutorGateway = pesquisarLivroPeloAutorGateway;
    }


    @Override
    public List<Livro> pesquisar(String autor) {
        return pesquisarLivroPeloAutorGateway.pesquisar(autor);
    }
}
