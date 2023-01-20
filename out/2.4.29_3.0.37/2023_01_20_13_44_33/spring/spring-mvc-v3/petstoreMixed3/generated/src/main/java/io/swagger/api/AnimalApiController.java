package io.swagger.api;

import io.swagger.model.Animal;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-20T14:05:34.326Z[Etc/UTC]")
@RestController
public class AnimalApiController implements AnimalApi {

    private static final Logger log = LoggerFactory.getLogger(AnimalApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AnimalApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addAnimal(@ApiParam(value = "Animal object that needs to be added to the store", required=true ) @Valid @RequestBody Animal body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteAnimal(@ApiParam(value = "Animal id to delete", required=true) @PathVariable("animalId") Long animalId,@ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Animal> getAnimalById(@ApiParam(value = "ID of pet to return", required=true) @PathVariable("animalId") Long animalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Animal>(objectMapper.readValue("{\n  \"color\" : \"red\",\n  \"className\" : \"className\"\n}", Animal.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Animal>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Animal>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateAnimal(@ApiParam(value = "Animal object that needs to be added.", required=true ) @Valid @RequestBody Animal body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateAnimalWithForm(@ApiParam(value = "ID of animal that needs to be updated", required=true) @PathVariable("animalId") Long animalId,@ApiParam(value = "") @RequestParam(value="name", required=false)  String name,@ApiParam(value = "") @RequestParam(value="status", required=false)  String status) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
