package com.ecommerce.shoppingcart.service.customer;

import com.ecommerce.shoppingcart.dto.ProductDto;

import java.util.List;

public interface CustomerProductService {

    List<ProductDto> getAllProducts();

    List<ProductDto> getAllProductsByName(String name);
}
