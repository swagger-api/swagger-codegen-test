package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.User;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-05-17T08:18:04.894Z[Etc/UTC]")public interface UserApiService {
      Response createUser(User body,SecurityContext securityContext)
      throws NotFoundException;
      Response createUsersWithArrayInput(List<User> body,SecurityContext securityContext)
      throws NotFoundException;
      Response createUsersWithListInput(List<User> body,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteUser(String username,SecurityContext securityContext)
      throws NotFoundException;
      Response getUserByName(String username,SecurityContext securityContext)
      throws NotFoundException;
      Response loginUser(String username,String password,SecurityContext securityContext)
      throws NotFoundException;
      Response logoutUser(SecurityContext securityContext)
      throws NotFoundException;
      Response updateUser(User body,String username,SecurityContext securityContext)
      throws NotFoundException;
}
