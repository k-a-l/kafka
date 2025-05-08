package com.kalyan.kafka.kafkaConsumer;

import com.kalyan.kafka.model.User;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaJsonConsumer {

    @KafkaListener(topics = "springBootTopic_json", groupId = "myGroup")
    public void consume(User user){
        System.out.println(user.toString());
    }
}
