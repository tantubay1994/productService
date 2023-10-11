package dev.prithvi.productService.controllers;

import dev.prithvi.productService.Services.ProductService;
import dev.prithvi.productService.data.GenericProductDto;
import dev.prithvi.productService.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/products/")
public class ProductController {
//  field injection
//    @Autowired
    private ProductService productService;

    //constructor injection
    public ProductController(@Qualifier("fakeStoreProductService") ProductService productService){
        this.productService = productService;
    };

    //setter injection
//    @Autowired
//    public void setProductService(ProductService productService){
//        this.productService = productService;
//    }

    @GetMapping
    public void getAllProducts(){

    }

    @GetMapping("{id}")
    public GenericProductDto getProductById(@PathVariable("id") Long id){
        return productService.getProductById(id);
    }

    @DeleteMapping("{id}")
    public void deleteProductById(){

    }

    @PostMapping
    public String createProduct(){
        return "Created new product with the id: " + UUID.randomUUID();
    }

    @PutMapping("{id}")
    public void updateProductById(){

    }
}
