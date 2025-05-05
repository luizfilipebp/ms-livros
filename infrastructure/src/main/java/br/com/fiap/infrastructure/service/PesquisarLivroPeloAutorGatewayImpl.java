package br.com.fiap.infrastructure.service;

import br.com.fiap.application.gateway.PesquisarLivroPeloAutorGateway;
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
public class PesquisarLivroPeloAutorGatewayImpl implements PesquisarLivroPeloAutorGateway {

    private final LivroRepository livroRepository;

    @Override
    public Page<Livro> pesquisar(String autor, int pageNumber, int pageSize) {
        var pageable = PageRequest.of(pageNumber, pageSize);
        var livroPage = livroRepository.findByAutorContainingIgnoreCase(autor, pageable);

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