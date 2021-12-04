package com.microservices.demo.twitter.to.kafka.service.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import twitter4j.Status;
import twitter4j.StatusAdapter;

@Component
public class TwitterKafkaStatusListerner extends StatusAdapter {

    private final Logger LOG = LoggerFactory.getLogger(TwitterKafkaStatusListerner.class);



    @Override
    public void onStatus(Status status) {

        LOG.info("Recieved a Twitter Status with text::\n {}",status.getText());

    }
}
