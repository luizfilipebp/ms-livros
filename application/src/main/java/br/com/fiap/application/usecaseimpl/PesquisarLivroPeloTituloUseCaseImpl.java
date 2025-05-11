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
        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("Titulo não pode ser nulo ou vazio");
        }

        if (numeroPagina < 0 || tamanhoPagina <= 0) {
            throw new IllegalArgumentException("Número da página e tamanho da página devem ser maiores que zero");
        }

        if (titulo.length() < 3) {
            throw new IllegalArgumentException("O titulo deve ter pelo menos 3 caracteres");
        }

        return pesquisarLivroPeloTituloGateway.pesquisar(titulo, numeroPagina, tamanhoPagina);
    }
}
