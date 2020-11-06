package de.bringmeister.service;

import org.springframework.stereotype.Component;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import de.bringmeister.dao.DataAccess;
import de.bringmeister.model.ProductPrice;

@Component//@Service
public class Service {
	
	private final DataAccess dataAccess;
	
	@Autowired
	public Service(@Qualifier("fakeDataBase") DataAccess dataAccess) {
		this.dataAccess = dataAccess;
	}
	
	public Optional<ProductPrice> getProductPriceById(String id) {
		return dataAccess.getProductPriceById(id);
	}

}
