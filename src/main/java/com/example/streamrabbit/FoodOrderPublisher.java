package com.example.streamrabbit;

import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(FoodOrderSource.class)
public class FoodOrderPublisher {
}