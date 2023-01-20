package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;


import java.util.Map;
import io.swagger.model.Order;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2023-01-20T08:08:38.956Z")
public interface StoreApiService {
      Response deleteOrder(String orderId,SecurityContext securityContext)
      throws NotFoundException;
      Response getInventory(SecurityContext securityContext)
      throws NotFoundException;
      Response getOrderById(Long orderId,SecurityContext securityContext)
      throws NotFoundException;
      Response placeOrder(Order body,SecurityContext securityContext)
      throws NotFoundException;
}
