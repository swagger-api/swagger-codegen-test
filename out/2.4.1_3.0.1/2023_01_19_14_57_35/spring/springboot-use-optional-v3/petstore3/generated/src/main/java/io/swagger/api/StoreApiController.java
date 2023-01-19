package io.swagger.api;

import java.util.Map;
import org.threeten.bp.OffsetDateTime;
import io.swagger.model.Order;
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
import java.util.Optional;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-19T15:16:00.777Z[Etc/UTC]")

@Controller
public class StoreApiController implements StoreApi {

    private static final Logger log = LoggerFactory.getLogger(StoreApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public StoreApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> deleteOrder(@ApiParam(value = "ID of the order that needs to be deleted",required=true) @PathVariable("orderId") Long orderId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Map<String, Integer>> getInventory() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Map<String, Integer>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Order> getOrderById(@ApiParam(value = "ID of order that needs to be fetched",required=true) @PathVariable("orderId") Long orderId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Order>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Order> placeOrder(@ApiParam(value = "") @RequestParam(value="id", required=false)  Long id,@ApiParam(value = "") @RequestParam(value="petId", required=false)  Long petId,@ApiParam(value = "") @RequestParam(value="quantity", required=false)  Integer quantity,@ApiParam(value = "") @RequestParam(value="shipDate", required=false)  OffsetDateTime shipDate,@ApiParam(value = "", allowableValues="placed, approved, delivered") @RequestParam(value="status", required=false)  String status,@ApiParam(value = "") @RequestParam(value="complete", required=false)  Boolean complete) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Order>(HttpStatus.NOT_IMPLEMENTED);
    }

}
