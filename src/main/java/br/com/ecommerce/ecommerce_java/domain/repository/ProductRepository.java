package br.com.ecommerce.ecommerce_java.domain.repository;

import br.com.ecommerce.ecommerce_java.domain.entities.Product;

public interface ProductRepository {

  Product createProduct(Product product);
  Product updateProduct(Long id,Product product);
  Product getProductById(Long id);
  void deleteProduct(Long id);
}
