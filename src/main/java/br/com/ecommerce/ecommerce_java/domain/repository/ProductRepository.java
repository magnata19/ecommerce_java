package br.com.ecommerce.ecommerce_java.domain.repository;

import br.com.ecommerce.ecommerce_java.domain.entities.Product;
import org.apache.coyote.BadRequestException;

public interface ProductRepository {

  Product createProduct(Product product) throws BadRequestException;
  Product updateProduct(Long id,Product product);
  Product getProductById(Long id);
  void deleteProduct(Long id);
}
