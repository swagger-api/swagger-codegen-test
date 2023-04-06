package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import org.joda.time.DateTime;
import java.util.Map;
import io.swagger.model.Order;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-04-06T09:14:26.563Z[Etc/UTC]")public class StoreApiServiceImpl implements StoreApi {
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
      public Response placeOrder(Long id,Long petId,Integer quantity,DateTime shipDate,String status,Boolean complete,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
