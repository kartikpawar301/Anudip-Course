package com.ims.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	
	@Column(length=25, nullable = false)
	@NotBlank(message="Product name cannot be blank")
	private String productName;
	
	@Column(length=25, nullable = false)
	@NotBlank(message="Product description cannot be blank")
	private String productDescription;
	
	@Column(length=25, nullable = false)
	@NotBlank(message="Product category cannot be blank")
	private String productCategory;
	
	@Column(length=11, nullable = false)
	@NotNull(message="Product quantity cannot be null")
	private int productQuantity;
	
	@Column(length=11, nullable = false)
	@NotNull(message="Product price cannot be null")
	private double productPrice;
	
	@ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinTable(name="Product_Supplier", joinColumns = @JoinColumn(name="productId"),
	inverseJoinColumns = @JoinColumn(name="supplierId"))
	private List<Supplier> supplier;

	@OneToMany(mappedBy = "product")
	private List<DefectiveItems> defectiveItems;
	
	@OneToMany(mappedBy = "product")
	private List<Sales> sales;
	
}
