package com.tsoftlatam.springcloudstream.producer;

import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(FoodOrderSource.class)
public class FoodOrderPublisher {
}