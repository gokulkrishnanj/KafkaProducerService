package com.example.ProducerService.Config;

import com.example.ProducerService.Constants.ApplicationConstants;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaAdminConfig {

    @Bean
    public NewTopic newTopic(){
        return TopicBuilder.name(ApplicationConstants.KAFKA_TOPIC).build();
    }

}
