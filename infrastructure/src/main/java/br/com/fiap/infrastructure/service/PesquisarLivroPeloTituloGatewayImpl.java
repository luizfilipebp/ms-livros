package br.com.fiap.infrastructure.service;

import br.com.fiap.application.gateway.PesquisarLivroPeloTituloGateway;
import br.com.fiap.core.model.Livro;
import br.com.fiap.core.model.Page;
import br.com.fiap.infrastructure.mapper.LivroMapper;
import br.com.fiap.infrastructure.repository.LivroRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PesquisarLivroPeloTituloGatewayImpl implements PesquisarLivroPeloTituloGateway {

    private final LivroRepository livroRepository;

    @Override
    public Page<Livro> pesquisar(String titulo, int numeroPagina, int tamanhoPagina) {

        var pageable = PageRequest.of(numeroPagina, tamanhoPagina);
        var livroPage = livroRepository.findByTituloContainingIgnoreCase(titulo, pageable);

        return new Page<>(
                livroPage.getContent().stream()
                        .map(LivroMapper.INSTANCE::livroEntityToLivro)
                        .collect(Collectors.toList()),
                livroPage.getNumber(),
                livroPage.getSize(),
                livroPage.getTotalElements()
        );
    }


}
