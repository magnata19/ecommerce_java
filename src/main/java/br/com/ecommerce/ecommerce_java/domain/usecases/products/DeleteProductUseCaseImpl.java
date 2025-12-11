package br.com.ecommerce.ecommerce_java.domain.usecases.products;

import br.com.ecommerce.ecommerce_java.domain.entities.Product;
import br.com.ecommerce.ecommerce_java.domain.repository.ProductRepository;

public class DeleteProductUseCaseImpl implements DeleteProductUseCase {

  private final ProductRepository productRepository;

  public DeleteProductUseCaseImpl(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @Override
  public void execute(Long id) {
    Product product = productRepository.getProductById(id);
    if (product == null) {
      throw new RuntimeException("Produto não encontrado.");
    }
    productRepository.deleteProduct(id);
  }
}
