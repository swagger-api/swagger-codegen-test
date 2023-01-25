package controllers;

import java.util.Map;
import apimodels.Order;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface StoreApiControllerImpInterface {
    void deleteOrder( @Min(1)Long orderId) ;

    Map<String, Integer> getInventory() ;

    Order getOrderById( @Min(1) @Max(10)Long orderId) ;

    Order placeOrder(Order body) ;

}
