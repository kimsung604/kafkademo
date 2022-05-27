package com.example.producermsa.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("kafka")
public class KafkaSettings {
    private String bootstrapServers;
    private String groupId;
    private String topic;
}
