package br.com.fiap.application.usecaseimpl;

import br.com.fiap.application.gateway.EditarLivroGateway;
import br.com.fiap.core.model.Livro;
import br.com.fiap.usecase.EditarLivroUseCase;

public class EditarLivroUseCaseImpl implements EditarLivroUseCase {
    private final EditarLivroGateway editarLivroGateway;

    public EditarLivroUseCaseImpl(EditarLivroGateway editarLivroGateway) {
        this.editarLivroGateway = editarLivroGateway;
    }

    @Override
    public Livro editar(Livro livro) {
        return editarLivroGateway.editar(livro);
    }
}
