package com.zphone.zphoneapp;

import java.io.Serializable;

public class Phone implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3L;
	private String sku;
	private String imei;
	private float price;
	private String model;
	
	public Phone() {
		this("","",0.0f,"");
	}
	
	public Phone(String sku, String imei, float price, String model) {
		super();
		this.sku = sku;
		this.imei = imei;
		this.price = price;
		this.model = model;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Phone [sku=" + sku + ", imei=" + imei + ", price=" + price + ", model=" + model + "]";
	}
	
	
	
	

}
