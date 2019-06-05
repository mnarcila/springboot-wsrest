package io.swagger.api;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Resultado;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2019-05-19T20:38:05.216-05:00")

@Controller
public class ConsultaApiController implements ConsultaApi {

	@Autowired
	RestTemplate restTemplate;

	public ResponseEntity<Resultado> consulta(
			@ApiParam(value = "Id de la factura", required = true) @RequestParam(value = "idFactura", required = true) BigDecimal idFactura

	) {

		System.out.println("ConsultaApi [" + idFactura + "]");
		String lEndPoint = "http://10.0.75.1:9003/enrutarFactura/consulta?idFactura=" + idFactura.intValue();

	 

		RestTemplate restTemplate = new RestTemplate();
		Resultado result = restTemplate.getForObject(lEndPoint, Resultado.class);

		if (result != null) {

			return ResponseEntity.ok(result);
		} else {
			return ResponseEntity.badRequest().body(null);
		}
	}

}
