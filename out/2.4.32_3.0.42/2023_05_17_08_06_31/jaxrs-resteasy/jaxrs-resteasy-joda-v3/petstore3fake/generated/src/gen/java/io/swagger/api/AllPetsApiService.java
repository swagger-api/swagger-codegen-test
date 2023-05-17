package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.AllPetsResponse;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-05-17T08:18:24.565Z[Etc/UTC]")public interface AllPetsApiService {
      Response getAllPets(SecurityContext securityContext)
      throws NotFoundException;
}
