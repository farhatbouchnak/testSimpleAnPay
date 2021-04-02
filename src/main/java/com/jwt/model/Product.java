package com.jwt.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@Entity
@Table(name="product")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", propOrder = { "id", "create_date", "label", "unit_price", "currency", "weight", "height", "marchands" })
@XmlRootElement(name = "Product")
public class Product {

	@Id
	private Integer id;
	
	private Date create_date;
	
	private String label;
	
	private Integer unit_price;
	
	private String currency;
	
	private long weight;
	
	private long height;
	
	private List<Marchand> marchands;

	public Product() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Integer getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(Integer unit_price) {
		this.unit_price = unit_price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public long getWeight() {
		return weight;
	}

	public void setWeight(long weight) {
		this.weight = weight;
	}

	public long getHeight() {
		return height;
	}

	public void setHeight(long height) {
		this.height = height;
	}

	public List<Marchand> getMarchands() {
		return marchands;
	}

	public void setMarchands(List<Marchand> marchands) {
		this.marchands = marchands;
	}

}
