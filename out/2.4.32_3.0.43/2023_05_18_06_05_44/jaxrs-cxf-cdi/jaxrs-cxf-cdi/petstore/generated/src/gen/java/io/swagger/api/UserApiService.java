package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.List;
import io.swagger.model.User;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2023-05-18T06:09:02.069Z")
public interface UserApiService {
      public Response createUser(User body, SecurityContext securityContext);
      public Response createUsersWithArrayInput(List<User> body, SecurityContext securityContext);
      public Response createUsersWithListInput(List<User> body, SecurityContext securityContext);
      public Response deleteUser(String username, SecurityContext securityContext);
      public Response getUserByName(String username, SecurityContext securityContext);
      public Response loginUser(String username, String password, SecurityContext securityContext);
      public Response logoutUser(SecurityContext securityContext);
      public Response updateUser(String username, User body, SecurityContext securityContext);
}
