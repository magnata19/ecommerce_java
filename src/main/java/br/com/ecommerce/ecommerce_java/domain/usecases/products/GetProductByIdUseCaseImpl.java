package br.com.ecommerce.ecommerce_java.domain.usecases.products;

import br.com.ecommerce.ecommerce_java.domain.entities.Product;
import br.com.ecommerce.ecommerce_java.domain.repository.ProductRepository;

public class GetProductByIdUseCaseImpl implements GetProductByIdUseCase {

  private final ProductRepository productRepository;

  public GetProductByIdUseCaseImpl(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @Override
  public Product execute(Long id) {
    Product currentProduct = productRepository.getProductById(id);
    if(currentProduct == null) {
      throw new RuntimeException("Produto não encontrado.");
    }
    return currentProduct;
  }
}
