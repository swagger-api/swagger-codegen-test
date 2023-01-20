package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import io.swagger.model.Animal;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2023-01-20T14:04:29.857Z[Etc/UTC]")public interface AnimalApiService {
      public Response addAnimal(Animal body, SecurityContext securityContext);
      public Response deleteAnimal(Long animalId, String apiKey, SecurityContext securityContext);
      public Response getAnimalById(Long animalId, SecurityContext securityContext);
      public Response updateAnimal(Animal body, SecurityContext securityContext);
      public Response updateAnimalWithForm(Long animalId, String name, String status, SecurityContext securityContext);
}
