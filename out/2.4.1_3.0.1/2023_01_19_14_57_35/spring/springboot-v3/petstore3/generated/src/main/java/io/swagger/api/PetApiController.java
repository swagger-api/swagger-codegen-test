package io.swagger.api;

import io.swagger.model.Category;
import io.swagger.model.ModelApiResponse;
import io.swagger.model.Pet;
import io.swagger.model.Tag;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-19T15:15:49.542Z[Etc/UTC]")

@Controller
public class PetApiController implements PetApi {

    private static final Logger log = LoggerFactory.getLogger(PetApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PetApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Pet> addPet(@ApiParam(value = "") @RequestParam(value="id", required=false)  Long id,@ApiParam(value = "") @RequestParam(value="name", required=false)  String name,@ApiParam(value = "") @RequestParam(value="category", required=false)  Category category,@ApiParam(value = "") @RequestParam(value="photoUrls", required=false)  List<String> photoUrls,@ApiParam(value = "") @RequestParam(value="tags", required=false)  List<Tag> tags,@ApiParam(value = "", allowableValues="available, pending, sold") @RequestParam(value="status", required=false)  String status) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Pet>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deletePet(@ApiParam(value = "Pet id to delete",required=true) @PathVariable("petId") Long petId,@ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Pet>> findPetsByStatus(@ApiParam(value = "Status values that need to be considered for filter", allowableValues = "available, pending, sold") @Valid @RequestParam(value = "status", required = false) String status) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<List<Pet>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Pet>> findPetsByTags(@ApiParam(value = "Tags to filter by") @Valid @RequestParam(value = "tags", required = false) List<String> tags) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<List<Pet>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Pet> getPetById(@ApiParam(value = "ID of pet to return",required=true) @PathVariable("petId") Long petId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Pet>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Pet> updatePet(@ApiParam(value = "") @RequestParam(value="id", required=false)  Long id,@ApiParam(value = "") @RequestParam(value="name", required=false)  String name,@ApiParam(value = "") @RequestParam(value="category", required=false)  Category category,@ApiParam(value = "") @RequestParam(value="photoUrls", required=false)  List<String> photoUrls,@ApiParam(value = "") @RequestParam(value="tags", required=false)  List<Tag> tags,@ApiParam(value = "", allowableValues="available, pending, sold") @RequestParam(value="status", required=false)  String status) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Pet>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updatePetWithForm(@ApiParam(value = "ID of pet that needs to be updated",required=true) @PathVariable("petId") Long petId,@ApiParam(value = "Name of pet that needs to be updated") @Valid @RequestParam(value = "name", required = false) String name,@ApiParam(value = "Status of pet that needs to be updated") @Valid @RequestParam(value = "status", required = false) String status) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ModelApiResponse> uploadFile(@ApiParam(value = "ID of pet to update",required=true) @PathVariable("petId") Long petId,@ApiParam(value = ""  )  @Valid @RequestBody Object body,@ApiParam(value = "Additional Metadata") @Valid @RequestParam(value = "additionalMetadata", required = false) String additionalMetadata) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<ModelApiResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
