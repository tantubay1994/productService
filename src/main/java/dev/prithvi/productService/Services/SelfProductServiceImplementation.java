package dev.prithvi.productService.Services;

import dev.prithvi.productService.data.GenericProductDto;
import dev.prithvi.productService.models.Product;
import org.springframework.stereotype.Service;

@Service("selfProductServiceImplementation")
public class SelfProductServiceImplementation implements ProductService{
    @Override
    public GenericProductDto getProductById(Long id){
        return null;
    }
}
