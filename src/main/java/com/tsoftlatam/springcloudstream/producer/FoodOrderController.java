package com.tsoftlatam.springcloudstream.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodOrderController {

    @Autowired
    FoodOrderSource foodOrderSource;

    @PostMapping("/order")
    @ResponseBody
    public String orderFood(@RequestBody FoodOrder foodOrder) {
        foodOrderSource.foodOrders().send(MessageBuilder.withPayload(foodOrder).build());
        System.out.println(foodOrder.toString() + " enviada");
        return "Food ordered!";
    }

}