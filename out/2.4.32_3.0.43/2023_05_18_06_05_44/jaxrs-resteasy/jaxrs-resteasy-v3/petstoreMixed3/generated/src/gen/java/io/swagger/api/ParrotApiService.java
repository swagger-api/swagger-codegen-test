package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.ParrotBody;
import io.swagger.model.ParrotBody1;

import java.util.List;
import java.util.Map;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-05-18T06:18:43.268Z[Etc/UTC]")
public interface ParrotApiService {
      Response addParrot(ParrotBody1 body,SecurityContext securityContext) throws NotFoundException;
      Response getParrots(SecurityContext securityContext) throws NotFoundException;
      Response updateParrots(ParrotBody body,SecurityContext securityContext) throws NotFoundException;
}
