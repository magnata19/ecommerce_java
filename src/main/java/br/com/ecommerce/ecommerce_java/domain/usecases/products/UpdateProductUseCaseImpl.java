package br.com.ecommerce.ecommerce_java.domain.usecases.products;

import br.com.ecommerce.ecommerce_java.domain.entities.Product;
import br.com.ecommerce.ecommerce_java.domain.repository.ProductRepository;

public class UpdateProductUseCaseImpl implements UpdateProductUseCase {

  private final ProductRepository productRepository;

  public UpdateProductUseCaseImpl(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @Override
  public Product execute(Long id, Product product) {
    Product currentProduct = productRepository.getProductById(id);
    if(currentProduct == null) {
      throw new RuntimeException("Produto não encontrado.");
    }
    return productRepository.updateProduct(id, product);
  }
}
