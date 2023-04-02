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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-04-02T20:05:13.940Z[Etc/UTC]")public interface StoreApiService {
      Response deleteOrder(Long orderId,SecurityContext securityContext)
      throws NotFoundException;
      Response getInventory(SecurityContext securityContext)
      throws NotFoundException;
      Response getOrderById(Long orderId,SecurityContext securityContext)
      throws NotFoundException;
      Response placeOrder(Order body,SecurityContext securityContext)
      throws NotFoundException;
}
