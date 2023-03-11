package tn.mypartner.sga.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;

import javax.persistence.Table;  
 
@Entity  

@Table  

public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column 
	private int id;  
	@Column  
	private String namear; 
	@Column  
	private String name;	
	@Column  
	private String category; 
	@Column  
	private String unit;  
	@Column  
	private String  serial;
	@Column  
	private String  type;
	@Column  
	private String  qmax;
	@Column  
	private String  volume;
	@Column  
	private String  remarks;	
	@Column  
	private boolean  stock;
	@Column  
	private boolean  used;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNamear() {
		return namear;
	}
	public void setNamear(String namear) {
		this.namear = namear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getQmax() {
		return qmax;
	}
	public void setQmax(String qmax) {
		this.qmax = qmax;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public boolean isStock() {
		return stock;
	}
	public void setStock(boolean stock) {
		this.stock = stock;
	}
	public boolean isUsed() {
		return used;
	}
	public void setUsed(boolean used) {
		this.used = used;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", namear=" + namear + ", name=" + name + ", category=" + category + ", unit="
				+ unit + ", serial=" + serial + ", type=" + type + ", qmax=" + qmax + ", volume=" + volume
				+ ", remarks=" + remarks + ", stock=" + stock + ", used=" + used + "]";
	}

	
}
