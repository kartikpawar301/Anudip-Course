package com.ims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ims.entity.Sales;
import com.ims.model.SalesDTO;
import com.ims.service.SalesService;
import com.ims.util.SalesConverter;

@RestController
public class SalesController {

	@Autowired
	SalesService salesService;
	
	@Autowired
	SalesConverter salesConverter;
	
	// http://localhost:8080/Sales/addSales
	@PostMapping("Sales/addSales")
	public SalesDTO saveSales(@RequestBody SalesDTO s1Dto) 
	{	
		Sales sales = salesConverter.convertToEntity(s1Dto);
		return salesService.addSales(sales);
	}
	
	@GetMapping("Sales/getSales/{saleId}")
	public ResponseEntity<Sales> getSales(@PathVariable("saleId") int saleId)
	{
		return new ResponseEntity<Sales>(salesService.getSalesById(saleId), HttpStatus.OK);
	}
	
	@GetMapping("Sales/getSales")
	public List<SalesDTO> getAllSales()
	{
		return salesService.getAllSales();
	}
	
}
