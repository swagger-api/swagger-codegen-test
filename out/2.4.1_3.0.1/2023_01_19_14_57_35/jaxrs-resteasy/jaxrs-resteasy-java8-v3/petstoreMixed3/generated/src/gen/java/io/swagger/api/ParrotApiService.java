package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Body8;
import io.swagger.model.InlineResponse200;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-01-19T15:18:05.578Z[Etc/UTC]")public abstract class ParrotApiService {
    public abstract Response addParrot(Object body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getParrots(SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateParrots(Body8 body,SecurityContext securityContext) throws NotFoundException;
}
