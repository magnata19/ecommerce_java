package br.com.ecommerce.ecommerce_java.domain.entities;

import br.com.ecommerce.ecommerce_java.domain.enums.Category;

import java.time.LocalDateTime;

public record Product(
        Long id,
        String name,
        String description,
        Category category,
        Double price,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
