package com.am.myapi.Product.mapper;

import com.am.myapi.Product.dto.ProductDto;
import com.am.myapi.Product.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public ProductDto fromEntityToDto(Product product) {
        return new ProductDto()
                .setId(product.getId())
                .setName(product.getName())
                .setDescription(product.getDescription())
                .setPrice(product.getPrice())
                .setQuantity(product.getQuantity())
                .setCreatedAt(product.getCreatedAt());
    }

    public Product fromDtoToEntity(ProductDto productDto) {
        return new Product()
                .setId(productDto.getId())
                .setName(productDto.getName())
                .setDescription(productDto.getDescription())
                .setPrice(productDto.getPrice())
                .setQuantity(productDto.getQuantity())
                .setCreatedAt(productDto.getCreatedAt());
    }

}
