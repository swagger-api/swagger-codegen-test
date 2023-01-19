package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Dog;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-01-19T15:18:00.002Z[Etc/UTC]")public abstract class DogApiService {
    public abstract Response addDog(Object body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteDog(Long dogId,String apiKey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getDogById(Long dogId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateDog(Object body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateDogWithForm(Long dogId,String name,String status,SecurityContext securityContext) throws NotFoundException;
}
