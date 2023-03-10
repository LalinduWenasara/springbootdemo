package com.example.productdemo.controller;
import com.example.productdemo.entity.ProductEntity;
import com.example.productdemo.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;


    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
   public List<ProductEntity> findAllProduct(){
        return productService.findAllProducts();
   }

   @GetMapping("/{id}")
   public Optional<ProductEntity> findProductById(@PathVariable("id") Long product_id){
       System.out.println("product controller hit");
        return productService.findById(product_id);
   }

    @GetMapping("/active")
    public String findActiveProduct(){
        return productService.getProductActive();
    }


    @PostMapping
    public ProductEntity saveProduct(@RequestBody ProductEntity productEntity){
        return productService.saveProduct(productEntity);
    }
    @PutMapping
    public ProductEntity updateProduct(@RequestBody ProductEntity productEntity) {
        return productService.updateProduct(productEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id) {
        productService.deleteProduct(id);
    }




}
