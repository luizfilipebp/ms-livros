package br.com.fiap.infrastructure.service;

import br.com.fiap.application.gateway.CadastrarLivroGateway;
import br.com.fiap.core.model.Livro;
import br.com.fiap.infrastructure.mapper.LivroMapper;
import br.com.fiap.infrastructure.repository.LivroRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CadastrarLivroGatewayImpl implements CadastrarLivroGateway {

    private final LivroRepository livroRepository;

    /**
     * Método para cadastrar um livro.
     *
     * @param livro o livro a ser cadastrado
     * @return o livro cadastrado
     */
    @Override
    public Livro cadastrar(Livro livro) {
        return LivroMapper.INSTANCE.livroEntityToLivro(livroRepository.save(LivroMapper.INSTANCE.livroToLivroEntity(livro)));
    }
}
