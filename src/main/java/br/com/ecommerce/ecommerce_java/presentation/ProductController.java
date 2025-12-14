package br.com.ecommerce.ecommerce_java.presentation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ecommerce.ecommerce_java.domain.entities.Product;
import br.com.ecommerce.ecommerce_java.domain.usecases.products.CreateProductUseCase;
import br.com.ecommerce.ecommerce_java.presentation.dtos.CreateProductDto;

@RestController
@RequestMapping("/products")
public class ProductController {

  private final CreateProductUseCase createProductUseCase;

  public ProductController(CreateProductUseCase createProductUseCase) {
    this.createProductUseCase = createProductUseCase;
  }

  // @PostMapping("/create")
  // public ResponseEntity<Product> createProduct(@RequestBody CreateProductDto product) {
  //   return createProductUseCase.execute(product);
  // }

}
