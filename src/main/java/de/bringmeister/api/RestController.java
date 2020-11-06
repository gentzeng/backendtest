package de.bringmeister.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import de.bringmeister.model.ProductPrice;
import de.bringmeister.service.Service;

@Controller
@RequestMapping("api")
public class RestController {
	
	private final Service service;

	@Autowired //inject actual Service
	public RestController(Service service) {
		this.service = service;
	}
	
	@GetMapping("/{id}")	
	public @ResponseBody Optional<ProductPrice> getProductPriceById(@PathVariable("id") String id) {
		return this.service.getProductPriceById(id);
	}

}
