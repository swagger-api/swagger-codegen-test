package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.Client;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-02-16T16:42:22.948Z[Etc/UTC]")public interface FakeClassnameTestApiService {
      Response testClassname(Client body,SecurityContext securityContext)
      throws NotFoundException;
}
