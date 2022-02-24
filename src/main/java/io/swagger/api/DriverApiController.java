package io.swagger.api;

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
public class DriverApiController implements DriverApi {

    private static final Logger log = LoggerFactory.getLogger(DriverApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DriverApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> driverAssigedToPerticularOrder(@ApiParam(value = "driver Id in the context path",required=true) @PathVariable("driverId") Integer driverId,@ApiParam(value = "order Id in the context path",required=true) @PathVariable("orderId") Integer orderId,@ApiParam(value = "Metadata about the request { \"requestId\": \"237e9877-e79b-12d4-a765-321741963000\", \"language\": \"en\", \"clientApp\": \"clientAppId provided\", \"requestTime\": \"yyyy-MM-dd HH:mm:ss\"  }" ) @RequestHeader(value="REQUEST-METADATA", required=false) String REQUEST_METADATA,@ApiParam(value = "" ) @RequestHeader(value="X-ENABLE-EXCEPTION-TRACE", required=false) Boolean X_ENABLE_EXCEPTION_TRACE) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
