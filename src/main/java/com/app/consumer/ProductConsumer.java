package com.app.consumer;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Product;

@FeignClient("PRODUCT-PRODUCER")
public interface ProductConsumer {
	
	@PostMapping("/save")
	public String saveProduct(@RequestBody Product p);
	
	@GetMapping("/getone")
	public Product getById(@RequestParam Integer id);
	
	@DeleteMapping("/deleteone")
	public String deleteById(@RequestParam Integer id);
	
	@GetMapping("/all")
	public List<Product> getAllProducts();

}
