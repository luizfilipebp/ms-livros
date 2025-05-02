package br.com.fiap.infrastructure.service;


import br.com.fiap.application.gateway.PesquisarLivroPeloAutorGateway;
import br.com.fiap.core.model.Livro;
import br.com.fiap.infrastructure.mapper.LivroMapper;
import br.com.fiap.infrastructure.repository.LivroRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PesquisarLivroPeloAutorGatewayImpl implements PesquisarLivroPeloAutorGateway {

    private final LivroRepository livroRepository;

    @Override
    public List<Livro> pesquisar(String autor) {
        return livroRepository.findByAutor(autor).stream()
                .map(LivroMapper.INSTANCE::toLivro)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
