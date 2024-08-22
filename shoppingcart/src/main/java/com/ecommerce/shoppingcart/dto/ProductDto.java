package com.ecommerce.shoppingcart.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class ProductDto {
    private Long id;

    private String name;

    private String description;

    private Long price;

    private byte[] byteImg;

    private Long categoryId;

    private MultipartFile img;

    private String categoryName;
}
