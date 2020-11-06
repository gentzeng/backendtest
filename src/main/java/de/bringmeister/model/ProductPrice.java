package de.bringmeister.model;

import java.util.Formatter;

//import javax.persistence.Entity

//@Entity
public class ProductPrice {
	private String id;
	private Price price;
	private String unit;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Price getPrice() {
		return price;
	}
	public void setPrice(Price price) {
		this.price = price;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	@Override
	public String toString() {
		StringBuilder sbuild = new StringBuilder();
		Formatter fmt = new Formatter(sbuild);
		fmt.format("ProductPrice={id='%s', %s, unit='%s'}", this.id, this.price.toString(), this.unit);
		fmt.close();
		return sbuild.toString();
	}

}
