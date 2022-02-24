package io.swagger.api;

import io.swagger.model.Cart;
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
public class CartApiController implements CartApi {

    private static final Logger log = LoggerFactory.getLogger(CartApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CartApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> deleteCartId(@ApiParam(value = "The name that needs to be deleted",required=true) @PathVariable("CartId") String cartId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Cart> getCartId(@ApiParam(value = "Cart Id in the context path",required=true) @PathVariable("CartId") Integer cartId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<Cart>(objectMapper.readValue("<Cart>  <cartId>123456789</cartId>  <dishId>123</dishId>  <dishQuatity>123</dishQuatity>  <orderMasterId>123</orderMasterId></Cart>", Cart.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<Cart>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Cart>(objectMapper.readValue("{\"empty\": false}", Cart.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Cart>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Cart>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Cart> updateCart(@ApiParam(value = "CartId that need to be updated",required=true) @PathVariable("CartId") String cartId,@ApiParam(value = "Updated transaction object" ,required=true )  @RequestBody Cart body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<Cart>(objectMapper.readValue("<Cart>  <cartId>123456789</cartId>  <dishId>123</dishId>  <dishQuatity>123</dishQuatity>  <orderMasterId>123</orderMasterId></Cart>", Cart.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<Cart>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Cart>(objectMapper.readValue("{\"empty\": false}", Cart.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Cart>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Cart>(HttpStatus.NOT_IMPLEMENTED);
    }

}
