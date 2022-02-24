package io.swagger.api;

import io.swagger.model.Cart;
import io.swagger.model.Customer;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-02-23T19:11:12.961Z")

@Controller
public class CustomerApiController implements CustomerApi {

    private static final Logger log = LoggerFactory.getLogger(CustomerApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CustomerApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addDishToCart(@ApiParam(value = "Transaction object" ,required=true )   @RequestBody Cart body,@ApiParam(value = "customer Id in the context path",required=true) @PathVariable("customerId") Integer customerId,@ApiParam(value = "Restaurant Id in the context path",required=true) @PathVariable("restaurantId") Integer restaurantId,@ApiParam(value = "dish Id in the context path",required=true) @PathVariable("dishId") Integer dishId,@ApiParam(value = "Metadata about the request { \"requestId\": \"237e9877-e79b-12d4-a765-321741963000\", \"language\": \"en\", \"clientApp\": \"clientAppId provided\", \"requestTime\": \"yyyy-MM-dd HH:mm:ss\"  }" ) @RequestHeader(value="REQUEST-METADATA", required=false) String REQUEST_METADATA,@ApiParam(value = "" ) @RequestHeader(value="X-ENABLE-EXCEPTION-TRACE", required=false) Boolean X_ENABLE_EXCEPTION_TRACE) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> createOrder(@ApiParam(value = "customer Id in the context path",required=true) @PathVariable("customerId") Integer customerId,@ApiParam(value = "Restaurant Id in the context path",required=true) @PathVariable("restaurantId") Integer restaurantId,@ApiParam(value = "customer Id in the context path",required=true) @PathVariable("cartID") Integer cartID,@ApiParam(value = "Metadata about the request { \"requestId\": \"237e9877-e79b-12d4-a765-321741963000\", \"language\": \"en\", \"clientApp\": \"clientAppId provided\", \"requestTime\": \"yyyy-MM-dd HH:mm:ss\"  }" ) @RequestHeader(value="REQUEST-METADATA", required=false) String REQUEST_METADATA,@ApiParam(value = "" ) @RequestHeader(value="X-ENABLE-EXCEPTION-TRACE", required=false) Boolean X_ENABLE_EXCEPTION_TRACE) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deletecustomerId(@ApiParam(value = "The name that needs to be deleted",required=true) @PathVariable("customerId") String customerId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Customer> getCustomerId(@ApiParam(value = "customer Id in the context path",required=true) @PathVariable("customerId") Integer customerId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<Customer>(objectMapper.readValue("<Customer>  <id>123456789</id>  <name>aeiou</name>  <email>aeiou</email>  <password>aeiou</password></Customer>", Customer.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<Customer>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Customer>(objectMapper.readValue("{\"empty\": false}", Customer.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Customer>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Customer>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> makingPaymentForOrder(@ApiParam(value = "customer Id in the context path",required=true) @PathVariable("customerId") Integer customerId,@ApiParam(value = "Restaurant Id in the context path",required=true) @PathVariable("orderId") Integer orderId,@ApiParam(value = "dish Id in the context path",required=true) @PathVariable("paymentId") Integer paymentId,@ApiParam(value = "Metadata about the request { \"requestId\": \"237e9877-e79b-12d4-a765-321741963000\", \"language\": \"en\", \"clientApp\": \"clientAppId provided\", \"requestTime\": \"yyyy-MM-dd HH:mm:ss\"  }" ) @RequestHeader(value="REQUEST-METADATA", required=false) String REQUEST_METADATA,@ApiParam(value = "" ) @RequestHeader(value="X-ENABLE-EXCEPTION-TRACE", required=false) Boolean X_ENABLE_EXCEPTION_TRACE) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Customer> updatecustomer(@ApiParam(value = "customerId that need to be updated",required=true) @PathVariable("customerId") String customerId,@ApiParam(value = "Updated transaction object" ,required=true )  @RequestBody Customer body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<Customer>(objectMapper.readValue("<Customer>  <id>123456789</id>  <name>aeiou</name>  <email>aeiou</email>  <password>aeiou</password></Customer>", Customer.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<Customer>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Customer>(objectMapper.readValue("{\"empty\": false}", Customer.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Customer>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Customer>(HttpStatus.NOT_IMPLEMENTED);
    }

}
