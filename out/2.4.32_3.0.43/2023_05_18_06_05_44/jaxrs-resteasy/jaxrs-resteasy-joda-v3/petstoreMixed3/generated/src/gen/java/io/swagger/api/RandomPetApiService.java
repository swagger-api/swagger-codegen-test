package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.SinglePetResponse;

import java.util.List;
import java.util.Map;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-05-18T06:19:16.272Z[Etc/UTC]")
public interface RandomPetApiService {
      Response getRandomPet(SecurityContext securityContext) throws NotFoundException;
}
