package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.Client;

import java.util.List;
import java.util.Map;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-05-18T06:18:43.268Z[Etc/UTC]")
public interface AnotherFakeApiService {
      Response testSpecialTags(Client body,SecurityContext securityContext) throws NotFoundException;
}
