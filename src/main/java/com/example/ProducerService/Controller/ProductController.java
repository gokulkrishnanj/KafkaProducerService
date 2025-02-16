package com.example.ProducerService.Controller;

import com.example.ProducerService.API.ProductAPI;
import com.example.ProducerService.DTO.ProductDTO;
import com.example.ProducerService.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController implements ProductAPI {

    @Autowired
    private ProductService productService;

    public ResponseEntity<String> publishProduct(ProductDTO productDTO){
        return new ResponseEntity<>(productService.publishProduct(productDTO), HttpStatus.OK);
    }
}
