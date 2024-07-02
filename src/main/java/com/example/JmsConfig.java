package com.example;


import org.apache.activemq.broker.BrokerFactory;
import org.apache.activemq.broker.BrokerService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JmsConfig {
    @Value("${jms-broker-local-broker-uri}")
    String brokerUri;


    @Bean
    public BrokerService brokerService() throws Exception {
        return BrokerFactory.createBroker(brokerUri, true);
    }
}
