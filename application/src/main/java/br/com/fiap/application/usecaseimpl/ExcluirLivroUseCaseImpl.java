package br.com.fiap.application.usecaseimpl;

import br.com.fiap.application.gateway.ExcluirLivroGateway;
import br.com.fiap.core.model.Livro;
import br.com.fiap.usecase.ExcluirLivroUseCase;

public class ExcluirLivroUseCaseImpl implements ExcluirLivroUseCase {
    private final ExcluirLivroGateway excluirLivroGateway;

    public ExcluirLivroUseCaseImpl(ExcluirLivroGateway excluirLivroGateway) {
        this.excluirLivroGateway = excluirLivroGateway;
    }

    @Override
    public void excluir(String isbn) {
         excluirLivroGateway.excluir(Livro.validarIsbn(isbn));
    }
}
