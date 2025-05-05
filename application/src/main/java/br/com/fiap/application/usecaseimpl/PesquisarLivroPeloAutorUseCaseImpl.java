package br.com.fiap.application.usecaseimpl;

import br.com.fiap.application.gateway.PesquisarLivroPeloAutorGateway;
import br.com.fiap.core.model.Livro;
import br.com.fiap.core.model.Page;
import br.com.fiap.usecase.PesquisarLivroPeloAutorUseCase;

public class PesquisarLivroPeloAutorUseCaseImpl implements PesquisarLivroPeloAutorUseCase {
    private final PesquisarLivroPeloAutorGateway pesquisarLivroPeloAutorGateway;

    public PesquisarLivroPeloAutorUseCaseImpl(PesquisarLivroPeloAutorGateway pesquisarLivroPeloAutorGateway) {
        this.pesquisarLivroPeloAutorGateway = pesquisarLivroPeloAutorGateway;
    }

    @Override
    public Page<Livro> pesquisar(String autor, int pageNumber, int pageSize) {
        if (autor == null || autor.isEmpty()) {
            throw new IllegalArgumentException("Autor não pode ser nulo ou vazio");
        }

        if (pageNumber < 0 || pageSize <= 0) {
            throw new IllegalArgumentException("Número da página e tamanho da página devem ser maiores que zero");
        }

        if (autor.length() < 3) {
            throw new IllegalArgumentException("O nome do autor deve ter pelo menos 3 caracteres");
        }

        return pesquisarLivroPeloAutorGateway.pesquisar(autor, pageNumber, pageSize);
    }
}
