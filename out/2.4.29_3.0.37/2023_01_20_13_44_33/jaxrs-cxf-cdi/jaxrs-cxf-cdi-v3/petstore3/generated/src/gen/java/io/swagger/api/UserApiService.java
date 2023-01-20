package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import io.swagger.model.User;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2023-01-20T13:59:22.946Z[Etc/UTC]")public interface UserApiService {
      public Response createUser(User body, SecurityContext securityContext);
      public Response createUser(Long id, String username, String firstName, String lastName, String email, String password, String phone, Integer userStatus, SecurityContext securityContext);
      public Response createUsersWithListInput(List<User> body, SecurityContext securityContext);
      public Response deleteUser(String username, SecurityContext securityContext);
      public Response getUserByName(String username, SecurityContext securityContext);
      public Response loginUser(String username, String password, SecurityContext securityContext);
      public Response logoutUser(SecurityContext securityContext);
      public Response updateUser(String username, User body, SecurityContext securityContext);
      public Response updateUser(String username, Long id, String username2, String firstName, String lastName, String email, String password, String phone, Integer userStatus, SecurityContext securityContext);
}
