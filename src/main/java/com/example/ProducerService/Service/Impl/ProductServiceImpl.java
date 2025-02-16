package com.example.ProducerService.Service.Impl;

import com.example.ProducerService.DTO.ProductDTO;
import com.example.ProducerService.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static com.example.ProducerService.Constants.ApplicationConstants.KAFKA_TOPIC;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public String publishProduct(ProductDTO productDTO){

        try {
            kafkaTemplate.send(KAFKA_TOPIC,productDTO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            return "Product published";
        }
    }

}
