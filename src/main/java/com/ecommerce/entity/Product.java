package com.ecommerce.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name="product")  
@Data // Automatically generate getters and setters behind the scene
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne()
	@JoinColumn(name = "category_id", nullable= false)
	private ProductCategory category;
	
	@Column(name = "sku")
	private String sku;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "unit_price")
	private BigDecimal unitprice;
	
	@Column(name = "active")
	private boolean active;
	
	@Column(name = "units_in_stock")
	private int unitsInStock;
	
	//hibernate automaically manages time stamps
	@CreationTimestamp
	@Column(name = "date_created")
	private Date dateCreated;
	
	@UpdateTimestamp
	@Column(name = "last_updated")
	private Date lastUpdated;
	
	

}
