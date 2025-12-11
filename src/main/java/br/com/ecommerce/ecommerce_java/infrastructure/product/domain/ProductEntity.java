package br.com.ecommerce.ecommerce_java.infrastructure.product.domain;

import br.com.ecommerce.ecommerce_java.domain.enums.Category;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String description;
  private Category category;
  private Double price;
  private LocalDateTime createdAt = LocalDateTime.now();
  private LocalDateTime updatedAt;
}
