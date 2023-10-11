package dev.prithvi.productService.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericProductDto {
    private String title;
    private String description;
    private String image;
    private String category;
    private double price;
}
