package de.bringmeister;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import de.bringmeister.service.Service;
import de.bringmeister.model.ProductPrice;
import de.bringmeister.model.Products;
import de.bringmeister.model.Product;

@SpringBootApplication
public class Application {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Bean
    //pass service here to read json file
    CommandLineRunner runner (Service service) {
    	return args -> {
    		ObjectMapper mapperJson = new ObjectMapper();
    		TypeReference<List<ProductPrice>> typeReferenceJson = new TypeReference<List<ProductPrice>> () {};
    		
    		try {
	    		List<ProductPrice> productPrices = mapperJson.readValue(
	    				new File("src/main/resources/products/prices.json"),
	    				typeReferenceJson);
	    		productPrices.stream()
	    			.forEach(productPrice -> System.out.println(productPrice.toString()));
    		} catch (IOException e) {
    			System.out.println("Unable to parse json: " + e.getMessage());
    		}

    		XmlMapper mapperXml = new XmlMapper();
    		//TypeReference<List<Product>> typeReferenceXml = new TypeReference<List<Product>> () {};
    		
    		try {
	    		Products products = mapperXml.readValue(
	    				new File("src/main/resources/products/products.xml"),
	    				Products.class);
	    		System.out.println(products.toString());
    		} catch (IOException e) {
    			System.out.println("Unable to parse xml: " + e.getMessage());
    		}
    	};
    }
}
