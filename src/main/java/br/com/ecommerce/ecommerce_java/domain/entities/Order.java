package br.com.ecommerce.ecommerce_java.domain.entities;

import br.com.ecommerce.ecommerce_java.domain.enums.Status;

import java.time.LocalDateTime;
import java.util.List;

public record Order(
        Long id,
        List<Product> products,
        Double totalPrice,
        String customerName,
        String customerAddress,
        Status status,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
