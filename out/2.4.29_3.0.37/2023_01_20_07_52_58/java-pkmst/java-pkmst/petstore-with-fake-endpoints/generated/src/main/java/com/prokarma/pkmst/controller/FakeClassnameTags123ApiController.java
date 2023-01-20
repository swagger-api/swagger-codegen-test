package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Client;

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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPKMSTServerCodegen", date = "2023-01-20T08:06:30.697Z")

@Controller
public class FakeClassnameTags123ApiController implements FakeClassnameTags123Api {
    private final ObjectMapper objectMapper;
@Autowired
    public FakeClassnameTags123ApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Client> testClassname(@ApiParam(value = "client model" ,required=true )   @RequestBody Client body,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Client>(objectMapper.readValue("", Client.class), HttpStatus.OK);
        }

        return new ResponseEntity<Client>(HttpStatus.OK);
    }

}
