package br.com.ecommerce.ecommerce_java.domain.usecases.products;

import br.com.ecommerce.ecommerce_java.domain.entities.Product;

public interface GetProductByIdUseCase {
  Product execute(Long id);
}
