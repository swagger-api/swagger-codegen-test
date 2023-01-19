package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.MasterApiService;
import io.swagger.api.factories.MasterApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.PartMaster;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/master")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-01-19T15:18:00.002Z[Etc/UTC]")public class MasterApi  {
   private final MasterApiService delegate;

   public MasterApi(@Context ServletConfig servletContext) {
      MasterApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("MasterApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (MasterApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = MasterApiServiceFactory.getMasterApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "", description = "", security = {
        @SecurityRequirement(name = "http_bearer_test")    }, tags={ "master" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "peticion realizada con exito", content = @Content(array = @ArraySchema(schema = @Schema(implementation = PartMaster.class)))) })
    public Response masterOperation(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.masterOperation(securityContext);
    }
}
