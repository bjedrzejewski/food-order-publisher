package com.e4developer.foodorderpublisher;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FoodOrder {

    private String restaurant;
    private String customerAddress;
    private String orderDescription;

    public FoodOrder(){

    }

    public FoodOrder(String restaurant, String customerAddress, String orderDescription) {
        this.restaurant = restaurant;
        this.customerAddress = customerAddress;
        this.orderDescription = orderDescription;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    @Override
    public String toString() {
        return "FoodOrder{" +
                "restaurant='" + restaurant + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", orderDescription='" + orderDescription + '\'' +
                '}';
    }
}
