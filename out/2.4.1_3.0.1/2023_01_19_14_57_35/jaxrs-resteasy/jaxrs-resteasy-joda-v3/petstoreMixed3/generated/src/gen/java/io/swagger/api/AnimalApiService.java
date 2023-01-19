package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Animal;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-01-19T15:17:57.749Z[Etc/UTC]")public abstract class AnimalApiService {
    public abstract Response addAnimal(Animal body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteAnimal(Long animalId,String apiKey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAnimalById(Long animalId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateAnimal(Animal body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateAnimalWithForm(Long animalId,String name,String status,SecurityContext securityContext) throws NotFoundException;
}
