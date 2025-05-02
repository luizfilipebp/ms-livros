package br.com.fiap.infrastructure.controller;


import br.com.fiap.core.model.Livro;
import br.com.fiap.infrastructure.dto.request.LivroPostReqBody;
import br.com.fiap.infrastructure.dto.request.LivroPutReqBody;
import br.com.fiap.infrastructure.dto.response.LivroPostResBody;
import br.com.fiap.infrastructure.dto.response.LivroPutResBody;
import br.com.fiap.infrastructure.mapper.LivroMapper;
import br.com.fiap.usecase.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/livros")
@AllArgsConstructor
public class LivroController {

    private final CadastrarLivroUseCase cadastrarLivro;
    private final EditarLivroUseCase editarLivro;
    private final ExcluirLivroUseCase excluirLivro;
    private final PesquisarLivroPeloIsbnUseCase pesquisarLivroPeloIsbn;
    private final PesquisarLivroPeloAutorUseCase pesquisarLivroPeloAutor;
    private final PesquisarLivroPeloTituloUseCase pesquisarLivroPeloTitulo;


    @GetMapping("/{isbn}")
    public ResponseEntity<Livro> livroPeloIsbn(@PathVariable String isbn) {
        Livro livro = pesquisarLivroPeloIsbn.pesquisar(Livro.validarIsbn(isbn)).orElseThrow(() -> new RuntimeException("Livro não encontrado"));
        return ResponseEntity.ok(livro);
    }

    @GetMapping("/autor/{autor}")
    public ResponseEntity<List<Livro>> livroPeloAutor(@PathVariable String autor) {
        //@TODO implementar a paginacao
        List<Livro> livro = pesquisarLivroPeloAutor.pesquisar(autor);
        return ResponseEntity.ok(livro);
    }

    @GetMapping("/titulo/{titulo}")
    public ResponseEntity<List<Livro>> livroPeloTitulo(@PathVariable String titulo) {
        //@TODO implementar a paginacao
        List<Livro> livro = pesquisarLivroPeloTitulo.pesquisar(titulo);
        return ResponseEntity.ok(livro);
    }


    @PostMapping
    public ResponseEntity<LivroPostResBody> cadastrar(@RequestBody @Valid LivroPostReqBody livro) {
        //@Todo mudar para created
        return ResponseEntity.ok(LivroMapper.INSTANCE.toLivroPostResBody(cadastrarLivro.cadastrar(LivroMapper.INSTANCE.toLivro(livro))));
    }

    @PutMapping("/{isbn}")
    public ResponseEntity<LivroPutResBody> editar(@PathVariable String isbn, @RequestBody LivroPutReqBody livro) {
        pesquisarLivroPeloIsbn.pesquisar(isbn).orElseThrow(() -> new RuntimeException("Livro não encontrado"));
        Livro livroEditado = LivroMapper.INSTANCE.toLivro(livro);
        livroEditado.setIsbn(isbn);

        return ResponseEntity.ok(LivroMapper.INSTANCE.toLivroPutResBody(editarLivro.editar(livroEditado)));
    }

    @DeleteMapping("/{isbn}")
    public ResponseEntity<Void> excluir(@PathVariable String isbn) {
        excluirLivro.excluir(isbn);
        return ResponseEntity.noContent().build();
    }

}
