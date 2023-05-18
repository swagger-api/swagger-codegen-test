package controllers;

import java.util.Map;
import apimodels.Order;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-05-18T06:07:21.418Z")

public class StoreApiControllerImp implements StoreApiControllerImpInterface {
    @Override
    public void deleteOrder( @Min(1)Long orderId)  {
        //Do your magic!!!
    }

    @Override
    public Map<String, Integer> getInventory()  {
        //Do your magic!!!
        return new HashMap<String, Integer>();
    }

    @Override
    public Order getOrderById( @Min(1) @Max(10)Long orderId)  {
        //Do your magic!!!
        return new Order();
    }

    @Override
    public Order placeOrder(Order body)  {
        //Do your magic!!!
        return new Order();
    }

}
