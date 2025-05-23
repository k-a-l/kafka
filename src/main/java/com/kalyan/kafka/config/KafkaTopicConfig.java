package com.kalyan.kafka.config;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic springBootTopic(){
        return TopicBuilder
                .name("springBootTopic")
                .build();

    }
    @Bean
    public NewTopic springBootTopic_json(){
        return TopicBuilder
                .name("springBootTopic_json")
                .build();
    }

}
