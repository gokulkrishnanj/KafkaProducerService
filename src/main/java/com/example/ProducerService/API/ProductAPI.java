package com.example.ProducerService.API;

import com.example.ProducerService.DTO.ProductDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/product/api/v1")
public interface ProductAPI {

    @PutMapping(value = "/publishProduct")
    ResponseEntity<String> publishProduct(@RequestBody ProductDTO productDTO);

}
