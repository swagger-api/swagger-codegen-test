package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.Client;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2023-05-18T06:12:52.601Z")
public interface FakeClassnameTestApiService {
      Response testClassname(Client body,SecurityContext securityContext)
      throws NotFoundException;
}
