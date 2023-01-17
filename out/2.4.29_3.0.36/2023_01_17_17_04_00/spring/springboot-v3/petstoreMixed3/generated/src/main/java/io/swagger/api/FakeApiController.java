package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.Client;
import io.swagger.model.EnumFormBody;
import io.swagger.model.FakeBody;
import io.swagger.model.FakeBody1;
import io.swagger.model.FakeJsonFormDataBody;
import io.swagger.model.OuterComposite;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-17T17:07:07.228Z[Etc/UTC]")
@RestController
public class FakeApiController implements FakeApi {

    private static final Logger log = LoggerFactory.getLogger(FakeApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public FakeApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Boolean> fakeOuterBooleanSerialize(@Parameter(in = ParameterIn.DEFAULT, description = "Input boolean as post body", schema=@Schema()) @Valid @RequestBody Boolean body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Boolean>(objectMapper.readValue("true", Boolean.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Boolean>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Boolean>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OuterComposite> fakeOuterCompositeSerialize(@Parameter(in = ParameterIn.DEFAULT, description = "Input composite as post body", schema=@Schema()) @Valid @RequestBody OuterComposite body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<OuterComposite>(objectMapper.readValue("{\n  \"my_string\" : \"my_string\",\n  \"my_number\" : 0.8008281904610115,\n  \"my_boolean\" : true\n}", OuterComposite.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OuterComposite>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OuterComposite>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<BigDecimal> fakeOuterNumberSerialize(@Parameter(in = ParameterIn.DEFAULT, description = "Input number as post body", schema=@Schema()) @Valid @RequestBody BigDecimal body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<BigDecimal>(objectMapper.readValue("0.8008281904610115", BigDecimal.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<BigDecimal>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<BigDecimal>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> fakeOuterStringSerialize(@Parameter(in = ParameterIn.DEFAULT, description = "Input string as post body", schema=@Schema()) @Valid @RequestBody String body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("\"\"", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Client> testClientModel(@Parameter(in = ParameterIn.DEFAULT, description = "client model", required=true, schema=@Schema()) @Valid @RequestBody Client body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Client>(objectMapper.readValue("{\n  \"client\" : \"client\"\n}", Client.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Client>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Client>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> testEndpointParameters(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody FakeBody body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> testEnumParameters(@Parameter(in = ParameterIn.HEADER, description = "Header parameter enum test (string array)" ,schema=@Schema(allowableValues={ ">", "$" }
)) @RequestHeader(value="enum_header_string_array", required=false) List<String> enumHeaderStringArray,@Parameter(in = ParameterIn.HEADER, description = "Header parameter enum test (string)" ,schema=@Schema(allowableValues={ "_abc", "-efg", "(xyz)" }
, defaultValue="-efg")) @RequestHeader(value="enum_header_string", required=false) String enumHeaderString,@Parameter(in = ParameterIn.QUERY, description = "Query parameter enum test (string array)" ,schema=@Schema(allowableValues={ ">", "$" }
)) @Valid @RequestParam(value = "enum_query_string_array", required = false) List<String> enumQueryStringArray,@Parameter(in = ParameterIn.QUERY, description = "Query parameter enum test (string)" ,schema=@Schema(allowableValues={ "_abc", "-efg", "(xyz)" }
, defaultValue="-efg")) @Valid @RequestParam(value = "enum_query_string", required = false, defaultValue="-efg") String enumQueryString,@Parameter(in = ParameterIn.QUERY, description = "Query parameter enum test (double)" ,schema=@Schema(allowableValues={ "1", "-2" }
)) @Valid @RequestParam(value = "enum_query_integer", required = false) Integer enumQueryInteger) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> testEnumRequestBody(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody EnumFormBody body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> testInlineAdditionalProperties(@Parameter(in = ParameterIn.DEFAULT, description = "request body", required=true, schema=@Schema()) @Valid @RequestBody Map<String, String> body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> testJsonFormData(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody FakeJsonFormDataBody body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
