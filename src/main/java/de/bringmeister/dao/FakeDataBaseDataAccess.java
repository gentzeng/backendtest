package de.bringmeister.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import de.bringmeister.model.ProductPrice;

@Repository("fakeDataBase")
public class FakeDataBaseDataAccess implements DataAccess{
	
	private static List<ProductPrice> db = new ArrayList<> ();

	@Override
	public Optional<ProductPrice> getProductPriceById(String id) {
		return db.stream()
			.filter(productPrice -> productPrice.getId().equals(id) )
			.findFirst();
	}
	
	public void getProductPricesFromJson() {
		
	}

}
