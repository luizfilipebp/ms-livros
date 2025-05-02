package br.com.fiap.infrastructure.service;

import br.com.fiap.application.gateway.EditarLivroGateway;
import br.com.fiap.core.model.Livro;
import br.com.fiap.infrastructure.mapper.LivroMapper;
import br.com.fiap.infrastructure.repository.LivroRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EditarLivroGatewayImpl implements EditarLivroGateway {

    private final LivroRepository livroRepository;

    /**
     * Método para editar um livro.
     *
     * @param livro o livro a ser editado
     * @return o livro editado
     */
    @Override
    public Livro editar(Livro livro) {
        return LivroMapper.INSTANCE.toLivro(livroRepository.save(LivroMapper.INSTANCE.toLivroEntity(livro)));
    }
}
