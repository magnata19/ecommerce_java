package br.com.ecommerce.ecommerce_java.infrastructure.product.repositories;

import br.com.ecommerce.ecommerce_java.domain.entities.Product;
import br.com.ecommerce.ecommerce_java.domain.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductRepositoryImpl implements ProductRepository {

  private final ProductRepositoryJpa productRepositoryJpa;

  @Override
  public Product createProduct(Product product) {
    return null;
  }

  @Override
  public Product updateProduct(Long id, Product product) {
    return null;
  }

  @Override
  public Product getProductById(Long id) {
    return null;
  }

  @Override
  public void deleteProduct(Long id) {

  }
}
