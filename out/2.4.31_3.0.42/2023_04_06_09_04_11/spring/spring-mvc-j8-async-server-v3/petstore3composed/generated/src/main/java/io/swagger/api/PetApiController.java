package io.swagger.api;

import io.swagger.model.ModelApiResponse;
import io.swagger.model.Pet;
import io.swagger.model.SubCategory;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-06T09:18:22.013Z[Etc/UTC]")
@RestController
public class PetApiController implements PetApi {

    private static final Logger log = LoggerFactory.getLogger(PetApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PetApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addPet(@ApiParam(value = "Pet object that needs to be added to the store", required=true ) @Valid @RequestBody Pet body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deletePet(@ApiParam(value = "Pet id to delete", required=true) @PathVariable("petId") Long petId,@ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ModelApiResponse> doCategoryStuff(@ApiParam(value = "" ) @Valid @RequestBody SubCategory body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("{\n  \"code\" : 0,\n  \"type\" : \"type\",\n  \"message\" : \"message\"\n}", ModelApiResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> feedPet(@ApiParam(value = "status" ,required=true) @RequestHeader(value="token", required=true) String token,@NotNull @ApiParam(value = "type of food", required = true) @Valid @RequestParam(value = "petType", required = true) String petType,@NotNull @ApiParam(value = "status", required = true) @Valid @RequestParam(value = "status", required = true) String status,@ApiParam(value = "ID of pet to return", required=true) @PathVariable("petId") Long petId,@ApiParam(value = "session id" ,required=true) @CookieValue(value="sessionId", required=true) String sessionId,@ApiParam(value = "Pet object that needs to be added to the store", required=true ) @Valid @RequestBody Pet body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Pet>> findPetsByStatus(@NotNull @ApiParam(value = "Status values that need to be considered for filter", required = true, allowableValues="available, pending, sold"
) @Valid @RequestParam(value = "status", required = true) List<String> status) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Pet>>(objectMapper.readValue("[ {\n  \"part\" : [ \"\", \"\" ],\n  \"name\" : \"doggie\",\n  \"id\" : 0,\n  \"status\" : \"available\"\n}, {\n  \"part\" : [ \"\", \"\" ],\n  \"name\" : \"doggie\",\n  \"id\" : 0,\n  \"status\" : \"available\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Pet>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Pet>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Pet>> findPetsByTags(@NotNull @ApiParam(value = "Tags to filter by", required = true) @Valid @RequestParam(value = "tags", required = true) List<String> tags) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Pet>>(objectMapper.readValue("[ {\n  \"part\" : [ \"\", \"\" ],\n  \"name\" : \"doggie\",\n  \"id\" : 0,\n  \"status\" : \"available\"\n}, {\n  \"part\" : [ \"\", \"\" ],\n  \"name\" : \"doggie\",\n  \"id\" : 0,\n  \"status\" : \"available\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Pet>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Pet>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Pet> getPetById(@ApiParam(value = "ID of pet to return", required=true) @PathVariable("petId") Long petId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Pet>(objectMapper.readValue("{\n  \"part\" : [ \"\", \"\" ],\n  \"name\" : \"doggie\",\n  \"id\" : 0,\n  \"status\" : \"available\"\n}", Pet.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Pet>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Pet>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updatePet(@ApiParam(value = "Pet object that needs to be added to the store", required=true ) @Valid @RequestBody Pet body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updatePetWithForm(@ApiParam(value = "ID of pet that needs to be updated", required=true) @PathVariable("petId") Long petId,@ApiParam(value = "") @RequestParam(value="name", required=false)  String name,@ApiParam(value = "") @RequestParam(value="status", required=false)  String status) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ModelApiResponse> uploadFile(@ApiParam(value = "ID of pet to update", required=true) @PathVariable("petId") Long petId,@ApiParam(value = "" ) @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("{\n  \"code\" : 0,\n  \"type\" : \"type\",\n  \"message\" : \"message\"\n}", ModelApiResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
