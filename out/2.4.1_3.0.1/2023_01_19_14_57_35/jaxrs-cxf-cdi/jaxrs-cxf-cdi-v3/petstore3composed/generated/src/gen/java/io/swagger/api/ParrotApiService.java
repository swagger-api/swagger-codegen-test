package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import io.swagger.model.Body1;
import io.swagger.model.InlineResponse200;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2023-01-19T15:16:58.766Z[Etc/UTC]")public interface ParrotApiService {
      public Response addParrot(Object body, SecurityContext securityContext);
      public Response getParrots(SecurityContext securityContext);
      public Response updateParrots(Body1 body, SecurityContext securityContext);
}
