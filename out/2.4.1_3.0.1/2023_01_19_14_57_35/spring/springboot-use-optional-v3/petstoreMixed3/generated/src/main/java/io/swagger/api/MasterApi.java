/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.PartMaster;
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

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-19T15:18:27.174Z[Etc/UTC]")

@Api(value = "master", description = "the master API")
public interface MasterApi {

    @ApiOperation(value = "", nickname = "masterOperation", notes = "", response = PartMaster.class, responseContainer = "List", authorizations = {
        @Authorization(value = "http_bearer_test")
    }, tags={ "master", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "peticion realizada con exito", response = PartMaster.class, responseContainer = "List") })
    @RequestMapping(value = "/master",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<PartMaster>> masterOperation();

}
