package com.ims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ims.entity.Product;
import com.ims.model.ProductDTO;
import com.ims.service.ProductService;
import com.ims.util.ProductConverter;

@RestController
public class ProductController 
{
	@Autowired
	ProductService productService;
	
	@Autowired
	ProductConverter productConverter;
	
	// http://localhost:8080/Product/addProduct
	@PostMapping("Product/addProduct")
	public ProductDTO saveProduct(@RequestBody ProductDTO pDto) 
	{	
		Product product = productConverter.convertToEntity(pDto);
		return productService.addProduct(product);
	}
	
	@GetMapping("Product/getProduct/{productId}")
	public ResponseEntity<Product> getProduct(@PathVariable("productId") int productId)
	{
		return new ResponseEntity<Product>(productService.getProductById(productId), HttpStatus.OK);
	}
	
	@PutMapping("Product/updateProduct/{productId}")
	public ResponseEntity<Product>editProduct(@PathVariable("productId") int productId, @RequestBody Product product)
	{
		return new ResponseEntity<Product>(productService.updateProductDetails(product, productId), HttpStatus.OK);
	}
	
	@DeleteMapping("Product/deleteProduct/{productId}")
	public ResponseEntity<String> deleteProduct(@PathVariable("productId") int productId)
	{
		productService.deleteProduct(productId);
		return new ResponseEntity<String>("Product Deleted Successfully...", HttpStatus.OK);
	}
	
	@GetMapping("Product/getProduct")
	public List<ProductDTO> getProducts() {
		
		return productService.getAllProducts();
	}
	
	@GetMapping("Product/getProductName/{productName}")
	public List<Product> getProductByName(@PathVariable("productName") String productName) {
		
		return productService.getProductByName(productName);
	}
	
	@GetMapping("Product/getProductCategory/{productCategory}")
	public List<Product> getProductByCategory(@PathVariable("productCategory") String productCategory) {
		
		return productService.getProductByCategory(productCategory);
	}
	
	@GetMapping("Product/getAllProductCategory")
	public List<String> getProductCategory() {
		
		return productService.getAllProductCategory();
	}
	
}
