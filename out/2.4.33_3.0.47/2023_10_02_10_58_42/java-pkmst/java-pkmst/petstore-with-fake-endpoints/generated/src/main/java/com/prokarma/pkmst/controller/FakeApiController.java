package com.prokarma.pkmst.controller;

import java.math.BigDecimal;
import com.prokarma.pkmst.model.Client;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import com.prokarma.pkmst.model.OuterComposite;
import com.prokarma.pkmst.model.User;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implemention
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPKMSTServerCodegen", date = "2023-10-02T11:01:34.194Z")

@Controller
public class FakeApiController implements FakeApi {
    private final ObjectMapper objectMapper;
@Autowired
    public FakeApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Boolean> fakeOuterBooleanSerialize(@ApiParam(value = "Input boolean as post body"  )   @RequestBody Boolean body,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Boolean>(objectMapper.readValue("", Boolean.class), HttpStatus.OK);
        }

        return new ResponseEntity<Boolean>(HttpStatus.OK);
    }

    public ResponseEntity<OuterComposite> fakeOuterCompositeSerialize(@ApiParam(value = "Input composite as post body"  )   @RequestBody OuterComposite body,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<OuterComposite>(objectMapper.readValue("", OuterComposite.class), HttpStatus.OK);
        }

        return new ResponseEntity<OuterComposite>(HttpStatus.OK);
    }

    public ResponseEntity<BigDecimal> fakeOuterNumberSerialize(@ApiParam(value = "Input number as post body"  )   @RequestBody BigDecimal body,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BigDecimal>(objectMapper.readValue("", BigDecimal.class), HttpStatus.OK);
        }

        return new ResponseEntity<BigDecimal>(HttpStatus.OK);
    }

    public ResponseEntity<String> fakeOuterStringSerialize(@ApiParam(value = "Input string as post body"  )   @RequestBody String body,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<String>(objectMapper.readValue("", String.class), HttpStatus.OK);
        }

        return new ResponseEntity<String>(HttpStatus.OK);
    }

    public ResponseEntity<Void> testBodyWithQueryParams(@ApiParam(value = "" ,required=true )   @RequestBody User body,
        @ApiParam(value = "", required = true)  @RequestParam(value = "query", required = true) String query,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Client> testClientModel(@ApiParam(value = "client model" ,required=true )   @RequestBody Client body,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Client>(objectMapper.readValue("", Client.class), HttpStatus.OK);
        }

        return new ResponseEntity<Client>(HttpStatus.OK);
    }

    public ResponseEntity<Void> testEndpointParameters(@ApiParam(value = "None", required=true) @RequestPart(value="number", required=true)  BigDecimal number,
        @ApiParam(value = "None", required=true) @RequestPart(value="double", required=true)  Double _double,
        @ApiParam(value = "None", required=true) @RequestPart(value="pattern_without_delimiter", required=true)  String patternWithoutDelimiter,
        @ApiParam(value = "None", required=true) @RequestPart(value="byte", required=true)  byte[] _byte,
        @ApiParam(value = "None") @RequestPart(value="integer", required=false)  Integer integer,
        @ApiParam(value = "None") @RequestPart(value="int32", required=false)  Integer int32,
        @ApiParam(value = "None") @RequestPart(value="int64", required=false)  Long int64,
        @ApiParam(value = "None") @RequestPart(value="float", required=false)  Float _float,
        @ApiParam(value = "None") @RequestPart(value="string", required=false)  String string,
        @ApiParam(value = "None") @RequestPart(value="binary", required=false)  byte[] binary,
        @ApiParam(value = "None") @RequestPart(value="date", required=false)  LocalDate date,
        @ApiParam(value = "None") @RequestPart(value="dateTime", required=false)  OffsetDateTime dateTime,
        @ApiParam(value = "None") @RequestPart(value="password", required=false)  String password,
        @ApiParam(value = "None") @RequestPart(value="callback", required=false)  String paramCallback,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> testEnumParameters(@ApiParam(value = "Form parameter enum test (string array)", allowableValues=">, $") @RequestPart(value="enum_form_string_array", required=false)  List<String> enumFormStringArray,
        @ApiParam(value = "Form parameter enum test (string)", allowableValues="_abc, -efg, (xyz)", defaultValue="-efg") @RequestPart(value="enum_form_string", required=false)  String enumFormString,
        @ApiParam(value = "Header parameter enum test (string array)" , allowableValues=">, $") @RequestHeader(value="enum_header_string_array", required=false) List<String> enumHeaderStringArray,
        @ApiParam(value = "Header parameter enum test (string)" , allowableValues="_abc, -efg, (xyz)", defaultValue="-efg") @RequestHeader(value="enum_header_string", required=false) String enumHeaderString,
        @ApiParam(value = "Query parameter enum test (string array)", allowableValues = ">, $")  @RequestParam(value = "enum_query_string_array", required = false) List<String> enumQueryStringArray,
        @ApiParam(value = "Query parameter enum test (string)", allowableValues = "_abc, -efg, (xyz)", defaultValue = "-efg")  @RequestParam(value = "enum_query_string", required = false, defaultValue="-efg") String enumQueryString,
        @ApiParam(value = "Query parameter enum test (double)", allowableValues = "1, -2")  @RequestParam(value = "enum_query_integer", required = false) Integer enumQueryInteger,
        @ApiParam(value = "Query parameter enum test (double)", allowableValues="1.1, -1.2") @RequestPart(value="enum_query_double", required=false)  Double enumQueryDouble,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> testInlineAdditionalProperties(@ApiParam(value = "request body" ,required=true )   @RequestBody Object param,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> testJsonFormData(@ApiParam(value = "field1", required=true) @RequestPart(value="param", required=true)  String param,
        @ApiParam(value = "field2", required=true) @RequestPart(value="param2", required=true)  String param2,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
