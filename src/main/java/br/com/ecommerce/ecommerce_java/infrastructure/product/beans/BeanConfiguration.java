package br.com.ecommerce.ecommerce_java.infrastructure.product.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.ecommerce.ecommerce_java.domain.usecases.products.CreateProductUseCase;
import br.com.ecommerce.ecommerce_java.domain.usecases.products.CreateProductUseCaseImpl;
import br.com.ecommerce.ecommerce_java.domain.usecases.products.DeleteProductUseCase;
import br.com.ecommerce.ecommerce_java.domain.usecases.products.DeleteProductUseCaseImpl;
import br.com.ecommerce.ecommerce_java.domain.usecases.products.GetProductByIdUseCase;
import br.com.ecommerce.ecommerce_java.domain.usecases.products.GetProductByIdUseCaseImpl;
import br.com.ecommerce.ecommerce_java.domain.usecases.products.UpdateProductUseCase;
import br.com.ecommerce.ecommerce_java.domain.usecases.products.UpdateProductUseCaseImpl;
import br.com.ecommerce.ecommerce_java.infrastructure.product.repositories.ProductRepositoryImpl;

@Configuration
public class BeanConfiguration {

  @Bean
  public CreateProductUseCase createProductUseCase(ProductRepositoryImpl productRepositoryImpl) {
    return new CreateProductUseCaseImpl(productRepositoryImpl);
  }

  @Bean
  public UpdateProductUseCase updateProductUseCase(ProductRepositoryImpl productRepositoryImpl) {
    return new UpdateProductUseCaseImpl(productRepositoryImpl);
  }

  @Bean
  public GetProductByIdUseCase getProductByIdUseCase(ProductRepositoryImpl productRepositoryImpl) {
    return new GetProductByIdUseCaseImpl(productRepositoryImpl);
  }

  @Bean
  public DeleteProductUseCase deleteProductUseCase(ProductRepositoryImpl productRepositoryImpl) {
    return new DeleteProductUseCaseImpl(productRepositoryImpl);
  }

}
