package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import java.util.Map;
import java.time.OffsetDateTime;
import io.swagger.model.Order;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-05-18T06:14:00.694Z[Etc/UTC]")
public class StoreApiServiceImpl implements StoreApi {
      public Response deleteOrder(Long orderId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getInventory(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getOrderById(Long orderId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response placeOrder(Order body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response placeOrder(Long id,Long petId,Integer quantity,OffsetDateTime shipDate,String status,Boolean complete,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
