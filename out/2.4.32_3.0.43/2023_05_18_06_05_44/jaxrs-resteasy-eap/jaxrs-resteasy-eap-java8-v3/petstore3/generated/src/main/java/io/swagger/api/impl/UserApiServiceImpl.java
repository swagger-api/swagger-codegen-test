package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.User;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-05-18T06:14:00.694Z[Etc/UTC]")
public class UserApiServiceImpl implements UserApi {
      public Response createUser(User body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response createUser(Long id,String username,String firstName,String lastName,String email,String password,String phone,Integer userStatus,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response createUsersWithListInput(List<User> body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response deleteUser(String username,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getUserByName(String username,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response loginUser(String username,String password,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response logoutUser(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response updateUser(String username,User body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response updateUser(String username,Long id,String username2,String firstName,String lastName,String email,String password,String phone,Integer userStatus,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
