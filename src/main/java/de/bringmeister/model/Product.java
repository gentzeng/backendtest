package de.bringmeister.model;

import java.util.Formatter;
import java.util.UUID;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Product {
	
	@JacksonXmlProperty(isAttribute = true)
	private UUID id;
	
	@JacksonXmlProperty(localName = "Name")
	private String name;
	
	@JacksonXmlProperty(localName = "Description")
	private String description;
	
	private String sku;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	
	@Override
	public String toString() {
		StringBuilder sbuild = new StringBuilder();
		Formatter fmt = null;
		try {
			fmt = new Formatter(sbuild);
			fmt.format("product={id='%s', Name='%s', Description='%s'}", this.id.toString(), this.name, this.description);
		} finally {
			fmt.close();
		}
		
		return sbuild.toString();		
	}
	

}
