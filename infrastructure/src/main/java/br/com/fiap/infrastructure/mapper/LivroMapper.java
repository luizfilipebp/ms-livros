package br.com.fiap.infrastructure.mapper;

import br.com.fiap.core.model.Livro;
import br.com.fiap.infrastructure.dto.request.LivroPostReqBody;
import br.com.fiap.infrastructure.dto.request.LivroPutReqBody;
import br.com.fiap.infrastructure.dto.response.LivroPostResBody;
import br.com.fiap.infrastructure.dto.response.LivroPutResBody;
import br.com.fiap.infrastructure.entities.LivroEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LivroMapper {
    LivroMapper INSTANCE = Mappers.getMapper(LivroMapper.class);

    @Mapping(source = "isbn", target = "isbn")
    Livro livroEntityToLivro(LivroEntity livroEntity);
    LivroEntity livroToLivroEntity(Livro livro);


    // Domain
    Livro toLivro(LivroPostReqBody livroPostReqBody);


    // PUT
    LivroPutReqBody toLivroPutReqBody(Livro livro);
    LivroPutResBody toLivroPutResBody(Livro livro);


    // Post
    LivroPostReqBody toLivroPostReqBody(Livro livro);
    LivroPostResBody toLivroPostResBody(Livro livro);
}