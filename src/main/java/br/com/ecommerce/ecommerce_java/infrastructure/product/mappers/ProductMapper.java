package br.com.ecommerce.ecommerce_java.infrastructure.product.mappers;

import br.com.ecommerce.ecommerce_java.domain.entities.Product;
import br.com.ecommerce.ecommerce_java.infrastructure.product.domain.ProductEntity;

public class ProductMapper {

  public static Product toDomain(ProductEntity product) {
    return new Product(
            product.getId(),
            product.getName(),
            product.getDescription(),
            product.getCategory(),
            product.getPrice(),
            product.getCreatedAt(),
            product.getUpdatedAt()
    );
  }

  public static ProductEntity toEntity(Product product) {
    return new ProductEntity(
            product.id(),
            product.name(),
            product.description(),
            product.category(),
            product.price(),
            product.createdAt(),
            product.updatedAt()
    );
  }
}
