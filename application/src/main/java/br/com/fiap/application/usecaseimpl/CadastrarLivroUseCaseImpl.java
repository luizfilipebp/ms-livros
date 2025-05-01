package br.com.fiap.application.usecaseimpl;

import br.com.fiap.application.gateway.CadastrarLivroGateway;
import br.com.fiap.core.model.Livro;
import br.com.fiap.usecase.CadastrarLivroUseCase;

public class CadastrarLivroUseCaseImpl implements CadastrarLivroUseCase {
    private final CadastrarLivroGateway cadastrarLivroGateway;

    public CadastrarLivroUseCaseImpl(CadastrarLivroGateway cadastrarLivroGateway) {
        this.cadastrarLivroGateway = cadastrarLivroGateway;
    }

    @Override
    public Livro cadastrar(Livro livro) {
        return cadastrarLivroGateway.cadastrar(livro);
    }
}