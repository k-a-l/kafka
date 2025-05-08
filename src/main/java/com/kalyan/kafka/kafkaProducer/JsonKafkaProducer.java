package com.kalyan.kafka.kafkaProducer;

import com.kalyan.kafka.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);

    private KafkaTemplate<String, User> kafkaTemplate;
    public JsonKafkaProducer(KafkaTemplate<String, User> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    public void sendMessage(User user){
        LOGGER.info("User Data ,{}",user.toString());
        Message<User> message= MessageBuilder.withPayload(user)
                .setHeader(KafkaHeaders.TOPIC,"springBootTopic_json")
                .build();
        kafkaTemplate.send(message);
        LOGGER.info("Message sent to kafka topic Json");

    }

}
