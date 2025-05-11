package br.com.fiap.infrastructure.repository;

import br.com.fiap.infrastructure.entities.LivroEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<LivroEntity, String> {
    Page<LivroEntity> findByAutorContainingIgnoreCase(String autor, Pageable pageable);
    Page<LivroEntity> findByTituloContainingIgnoreCase(String titulo, Pageable pageable);
}