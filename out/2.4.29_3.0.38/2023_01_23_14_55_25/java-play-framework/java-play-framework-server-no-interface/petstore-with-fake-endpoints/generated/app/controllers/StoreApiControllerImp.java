package controllers;

import java.util.Map;
import apimodels.Order;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-23T15:09:31.063Z")

public class StoreApiControllerImp  {
    
    public void deleteOrder(String orderId) throws Exception {
        //Do your magic!!!
    }

    
    public Map<String, Integer> getInventory() throws Exception {
        //Do your magic!!!
        return new HashMap<String, Integer>();
    }

    
    public Order getOrderById( @Min(1) @Max(5)Long orderId) throws Exception {
        //Do your magic!!!
        return new Order();
    }

    
    public Order placeOrder(Order body) throws Exception {
        //Do your magic!!!
        return new Order();
    }

}
