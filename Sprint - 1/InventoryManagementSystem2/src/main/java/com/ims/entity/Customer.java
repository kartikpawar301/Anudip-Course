package com.ims.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Customer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	
	@Column(length=25, nullable = false)
	@NotBlank(message="Customer name cannot be blank")
	private String customerName;
	
	@Column(length=25, nullable = false)
	@NotBlank(message="Customer address cannot be blank")
	private String customerAddress;
	
	@Column(length=11, nullable = false, unique=true)
	@NotNull(message="Customer mobile number cannot be null")
	private long customerMobileNumber;
	
	@OneToMany(mappedBy = "customer")
	private List<Sales> sales;
}
