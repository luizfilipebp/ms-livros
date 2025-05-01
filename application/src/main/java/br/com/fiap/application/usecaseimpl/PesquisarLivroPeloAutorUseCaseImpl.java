package br.com.fiap.application.usecaseimpl;

import br.com.fiap.core.model.Livro;
import br.com.fiap.usecase.PesquisarLivroPeloAutorUseCase;

import java.util.List;

public class PesquisarLivroPeloAutorUseCaseImpl implements PesquisarLivroPeloAutorUseCase {
    private final PesquisarLivroPeloAutorUseCase pesquisarLivroPeloAutorUseCase;

    public PesquisarLivroPeloAutorUseCaseImpl(PesquisarLivroPeloAutorUseCase pesquisarLivroPeloAutorUseCase) {
        this.pesquisarLivroPeloAutorUseCase = pesquisarLivroPeloAutorUseCase;
    }

    @Override
    public List<Livro> pesquisar(String autor) {
        return pesquisarLivroPeloAutorUseCase.pesquisar(autor);
    }
}
