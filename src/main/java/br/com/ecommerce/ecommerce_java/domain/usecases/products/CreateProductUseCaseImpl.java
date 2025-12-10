package br.com.ecommerce.ecommerce_java.domain.usecases.products;

import br.com.ecommerce.ecommerce_java.domain.entities.Product;
import br.com.ecommerce.ecommerce_java.domain.repository.ProductRepository;

public class CreateProductUseCaseImpl implements CreateProductUseCase {

  private final ProductRepository productRepository;

  public CreateProductUseCaseImpl(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @Override
  public Product execute(Product product) {
    Product currentProduct = productRepository.getProductById(product.id());
    if(currentProduct == null) {
      throw new RuntimeException("Produto não encontrado.");
    }
    return productRepository.createProduct(product);
  }
}
