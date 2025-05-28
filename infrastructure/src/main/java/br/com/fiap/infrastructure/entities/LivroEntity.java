package br.com.fiap.infrastructure.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "livros")
@NoArgsConstructor
@AllArgsConstructor
public class LivroEntity {
    @Id
    @Column(name = "liv_isbn", nullable = false)
    private String isbn;

    @Column(name = "liv_titulo")
    private String titulo;

    @Column(name = "liv_autor")
    private String autor;

    @Column(name = "liv_editora")
    private String editora;

    @Column(name = "liv_quantidade", nullable = false)
    private Integer quantidade;
}
