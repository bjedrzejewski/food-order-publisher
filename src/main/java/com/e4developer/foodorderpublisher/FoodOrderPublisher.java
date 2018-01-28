package com.e4developer.foodorderpublisher;

import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(FoodOrderSource.class)
public class FoodOrderPublisher {
}
