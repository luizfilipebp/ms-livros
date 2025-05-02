package br.com.fiap.infrastructure.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "livro")
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

    @Column(name = "liv_ano")
    private String editora;
}
