package br.com.ecommerce.ecommerce_java.infrastructure.product.repositories;

import br.com.ecommerce.ecommerce_java.domain.entities.Product;
import br.com.ecommerce.ecommerce_java.domain.repository.ProductRepository;
import br.com.ecommerce.ecommerce_java.infrastructure.product.domain.ProductEntity;
import br.com.ecommerce.ecommerce_java.infrastructure.product.mappers.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ProductRepositoryImpl implements ProductRepository {

  private final ProductRepositoryJpa productRepositoryJpa;

  @Override
  public Product createProduct(Product product) {
    ProductEntity productEntity = ProductMapper.toEntity(product);
    ProductEntity save = productRepositoryJpa.save(productEntity);
    return ProductMapper.toDomain(save);
  }

  @Override
  public Product updateProduct(Long id, Product product) {
    Optional<ProductEntity> currentProduct = productRepositoryJpa.findById(id);
    if(currentProduct.isEmpty()) {
      throw new RuntimeException("Produto não encontrado.");
    }
    ProductEntity productEntity = currentProduct.get();
    productEntity.setName(product.name());
    productEntity.setDescription(product.description());
    productEntity.setCategory(product.category());
    productEntity.setPrice(product.price());
    productEntity.setUpdatedAt(product.updatedAt() != null ? product.updatedAt()
            : LocalDateTime.now());
    ProductEntity toSave = productRepositoryJpa.save(productEntity);
    return ProductMapper.toDomain(toSave);
  }

  @Override
  public Product getProductById(Long id) {
    Optional<ProductEntity> productEntity = productRepositoryJpa.findById(id);
    if(productEntity.isEmpty()) {
      throw new RuntimeException("Produto não encontrado.");
    }
    return ProductMapper.toDomain(productEntity.get());
  }

  @Override
  public void deleteProduct(Long id) {
    Optional<ProductEntity> toDelete = productRepositoryJpa.findById(id);
    if(toDelete.isEmpty()) {
      throw new RuntimeException("Produto não encontrado.");
    }
    productRepositoryJpa.deleteById(id);
  }
}
