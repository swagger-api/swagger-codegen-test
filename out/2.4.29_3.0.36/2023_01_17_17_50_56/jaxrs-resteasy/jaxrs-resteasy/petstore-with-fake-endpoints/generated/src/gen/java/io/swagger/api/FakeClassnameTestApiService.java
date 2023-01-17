package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.Client;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2023-01-17T18:02:46.460Z")
public interface FakeClassnameTestApiService {
      Response testClassname(Client body,SecurityContext securityContext)
      throws NotFoundException;
}
