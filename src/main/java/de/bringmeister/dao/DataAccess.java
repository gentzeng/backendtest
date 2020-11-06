package de.bringmeister.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import de.bringmeister.model.ProductPrice;

public interface DataAccess {
	
	@Autowired
	public Optional<ProductPrice> getProductPriceById(String id);
}
