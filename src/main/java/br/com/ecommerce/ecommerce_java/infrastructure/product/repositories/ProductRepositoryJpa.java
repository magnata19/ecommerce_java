package br.com.ecommerce.ecommerce_java.infrastructure.product.repositories;

import br.com.ecommerce.ecommerce_java.infrastructure.product.domain.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositoryJpa extends JpaRepository<ProductEntity, Long> {
}
