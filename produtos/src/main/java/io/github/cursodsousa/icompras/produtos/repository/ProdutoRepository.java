package io.github.cursodsousa.icompras.produtos.repository;

import io.github.cursodsousa.icompras.produtos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
