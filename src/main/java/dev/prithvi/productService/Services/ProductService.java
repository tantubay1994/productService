package dev.prithvi.productService.Services;

import dev.prithvi.productService.data.GenericProductDto;
import dev.prithvi.productService.models.Product;

public interface ProductService {

    GenericProductDto getProductById(Long id);
}
