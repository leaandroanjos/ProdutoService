package br.com.leandro.ProdutoService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.leandro.ProdutoService.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> { }
