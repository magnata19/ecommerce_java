package br.com.ecommerce.ecommerce_java.domain.usecases.products;

import br.com.ecommerce.ecommerce_java.domain.entities.Product;

public interface UpdateProductUseCase {
  Product execute (Long id, Product product);
}
