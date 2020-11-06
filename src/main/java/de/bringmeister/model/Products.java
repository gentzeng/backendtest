package de.bringmeister.model;

import java.util.Formatter;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Products")
public class Products {
	@JacksonXmlProperty(localName = "Product")
	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Product> products;

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return this.products.stream().map(Object::toString).collect(Collectors.joining("\n"));
	
	}
	
}
