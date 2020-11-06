package de.bringmeister.model;

import java.util.Formatter;

public class Price {
	private Double value;
	private String currency;

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	@Override
	public String toString() {
		StringBuilder sbuild = new StringBuilder();
		Formatter fmt = new Formatter(sbuild);
		fmt.format("price={value='%f', currency='%s'}", this.value, this.currency);
		fmt.close();
		return sbuild.toString();
	}

}
