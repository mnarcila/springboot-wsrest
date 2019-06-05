package io.swagger.api;

import io.swagger.model.Resultado;
import java.math.BigDecimal;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2019-05-19T20:38:05.216-05:00")

@Api(value = "consulta", description = "the consulta API")
public interface ConsultaApi {

    @ApiOperation(value = "Consultar valores", notes = "", response = Resultado.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Exitoso", response = Resultado.class),
        @ApiResponse(code = 404, message = "Error", response = Resultado.class) })
    @RequestMapping(value = "/consulta",
        produces = { "application/json" }, 
       
        method = RequestMethod.GET)
    ResponseEntity<Resultado> consulta(@ApiParam(value = "Id de la factura", required = true) @RequestParam(value = "idFactura", required = true) BigDecimal idFactura



);

}
