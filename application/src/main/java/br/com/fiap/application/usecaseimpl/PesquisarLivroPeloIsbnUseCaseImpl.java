package br.com.fiap.application.usecaseimpl;

import br.com.fiap.application.gateway.PesquisarLivroPeloIsbnGateway;
import br.com.fiap.core.model.Livro;
import br.com.fiap.usecase.PesquisarLivroPeloIsbnUseCase;

import java.util.List;

public class PesquisarLivroPeloIsbnUseCaseImpl implements PesquisarLivroPeloIsbnUseCase {
    private final PesquisarLivroPeloIsbnGateway pesquisarLivroPeloIsbnGateway;

    public PesquisarLivroPeloIsbnUseCaseImpl(PesquisarLivroPeloIsbnGateway pesquisarLivroPeloIsbnGateway) {
        this.pesquisarLivroPeloIsbnGateway = pesquisarLivroPeloIsbnGateway;
    }

    @Override
    public List<Livro> pesquisar(String isbn) {
        return pesquisarLivroPeloIsbnGateway.pesquisar(Livro.validarIsbn(isbn));
    }
}
