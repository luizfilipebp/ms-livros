package br.com.fiap.infrastructure.service;

import br.com.fiap.core.model.Livro;
import br.com.fiap.infrastructure.mapper.LivroMapper;
import br.com.fiap.infrastructure.repository.LivroRepository;
import br.com.fiap.usecase.PesquisarLivroPeloTituloUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PesquisarLivroPeloTituloUseCaseImpl implements PesquisarLivroPeloTituloUseCase {

    private final LivroRepository livroRepository;

    @Override
    public List<Livro> pesquisar(String titulo) {
        return livroRepository.findByTitulo(titulo).stream()
                .map(LivroMapper.INSTANCE::toLivro)
                .toList();
    }
}
