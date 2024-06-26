/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.42).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Animal;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-17T08:18:20.084Z[Etc/UTC]")
@Validated
@Api(value = "animal", description = "the animal API")
public interface AnimalApi {

    @ApiOperation(value = "Add a new animal to the store", nickname = "addAnimal", notes = "", tags={ "animal", })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/animal",
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> addAnimal(@ApiParam(value = "Animal object that needs to be added to the store", required=true ) @Valid @RequestBody Animal body);


    @ApiOperation(value = "Deletes a animal", nickname = "deleteAnimal", notes = "", tags={ "animal", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid animal value") })
    @RequestMapping(value = "/animal/{animalId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteAnimal(@ApiParam(value = "Animal id to delete", required=true) @PathVariable("animalId") Long animalId, @ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey);


    @ApiOperation(value = "Find animal by ID", nickname = "getAnimalById", notes = "Returns a single animal", response = Animal.class, tags={ "animal", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Animal.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Pet not found") })
    @RequestMapping(value = "/animal/{animalId}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Animal> getAnimalById(@ApiParam(value = "ID of pet to return", required=true) @PathVariable("animalId") Long animalId);


    @ApiOperation(value = "Update an existing animal", nickname = "updateAnimal", notes = "", tags={ "animal", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Animal not found"),
        @ApiResponse(code = 405, message = "Validation exception") })
    @RequestMapping(value = "/animal",
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateAnimal(@ApiParam(value = "Animal object that needs to be added.", required=true ) @Valid @RequestBody Animal body);


    @ApiOperation(value = "Updates a animal", nickname = "updateAnimalWithForm", notes = "", tags={ "animal", })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/animal/{animalId}",
        consumes = { "application/x-www-form-urlencoded" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> updateAnimalWithForm(@ApiParam(value = "ID of animal that needs to be updated", required=true) @PathVariable("animalId") Long animalId, @ApiParam(value = "") @RequestParam(value="name", required=false)  String name, @ApiParam(value = "") @RequestParam(value="status", required=false)  String status);

}

