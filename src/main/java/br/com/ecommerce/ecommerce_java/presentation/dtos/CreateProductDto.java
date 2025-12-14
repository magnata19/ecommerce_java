package br.com.ecommerce.ecommerce_java.presentation.dtos;

import br.com.ecommerce.ecommerce_java.domain.enums.Category;
import jakarta.validation.constraints.NotEmpty;

public record CreateProductDto(
        @NotEmpty(message = "O nome do produto não pode ser vazio.")
        String name,
        @NotEmpty(message = "A descrição do produto não pode ser vazia.")
        String description,
        @NotEmpty(message = "A categoria do produto não pode ser vazia.")
        Category category,
        @NotEmpty(message = "O preço do produto não pode ser vazio.")
        Double price

) {

}
