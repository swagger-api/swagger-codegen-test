package io.swagger.api;

import io.swagger.model.User;
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-19T15:15:48.089Z[Etc/UTC]")

@Controller
public class UserApiController implements UserApi {

    private static final Logger log = LoggerFactory.getLogger(UserApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UserApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<User> createUser(@ApiParam(value = "") @RequestParam(value="id", required=false)  Long id,@ApiParam(value = "") @RequestParam(value="username", required=false)  String username,@ApiParam(value = "") @RequestParam(value="firstName", required=false)  String firstName,@ApiParam(value = "") @RequestParam(value="lastName", required=false)  String lastName,@ApiParam(value = "") @RequestParam(value="email", required=false)  String email,@ApiParam(value = "") @RequestParam(value="password", required=false)  String password,@ApiParam(value = "") @RequestParam(value="phone", required=false)  String phone,@ApiParam(value = "") @RequestParam(value="userStatus", required=false)  Integer userStatus) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<User> createUsersWithListInput(@ApiParam(value = ""  )  @Valid @RequestBody List<User> body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteUser(@ApiParam(value = "The name that needs to be deleted",required=true) @PathVariable("username") String username) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<User> getUserByName(@ApiParam(value = "The name that needs to be fetched. Use user1 for testing. ",required=true) @PathVariable("username") String username) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> loginUser(@ApiParam(value = "The user name for login") @Valid @RequestParam(value = "username", required = false) String username,@ApiParam(value = "The password for login in clear text") @Valid @RequestParam(value = "password", required = false) String password) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> logoutUser() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateUser(@ApiParam(value = "name that need to be deleted",required=true) @PathVariable("username") String username2,@ApiParam(value = "") @RequestParam(value="id", required=false)  Long id,@ApiParam(value = "") @RequestParam(value="username", required=false)  String username,@ApiParam(value = "") @RequestParam(value="firstName", required=false)  String firstName,@ApiParam(value = "") @RequestParam(value="lastName", required=false)  String lastName,@ApiParam(value = "") @RequestParam(value="email", required=false)  String email,@ApiParam(value = "") @RequestParam(value="password", required=false)  String password,@ApiParam(value = "") @RequestParam(value="phone", required=false)  String phone,@ApiParam(value = "") @RequestParam(value="userStatus", required=false)  Integer userStatus) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
