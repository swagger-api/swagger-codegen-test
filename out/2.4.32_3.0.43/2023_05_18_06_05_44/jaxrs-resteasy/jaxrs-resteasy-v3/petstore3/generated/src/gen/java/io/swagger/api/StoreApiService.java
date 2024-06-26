package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import java.util.Date;
import java.util.Map;
import io.swagger.model.Order;

import java.util.List;
import java.util.Map;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-05-18T06:14:00.406Z[Etc/UTC]")
public interface StoreApiService {
      Response deleteOrder(Long orderId,SecurityContext securityContext) throws NotFoundException;
      Response getInventory(SecurityContext securityContext) throws NotFoundException;
      Response getOrderById(Long orderId,SecurityContext securityContext) throws NotFoundException;
      Response placeOrder(Order body,SecurityContext securityContext) throws NotFoundException;
      Response placeOrder(Long id,Long petId,Integer quantity,Date shipDate,String status,Boolean complete,SecurityContext securityContext) throws NotFoundException;
}
