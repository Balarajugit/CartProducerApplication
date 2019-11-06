package com.app.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.consumer.ProductConsumer;
import com.app.model.Product;

@RestController
public class CartRestController {
	@Autowired
	private ProductConsumer client;
	
	@PostMapping("/saveData")
	public String saveDetails(@RequestBody Product p) {
		return client.saveProduct(p);
	}
	@GetMapping("/alldata")
	public List<Product> getAll(){
		return client.getAllProducts();
	}
	@DeleteMapping("/iddelete")
	public void delete(@RequestParam Integer id) {
		client.deleteById(id);
		
	}
	@GetMapping("/idget")
	public Product getByIdProduct(@RequestParam Integer id) {
		return client.getById(id);
	}
	@PutMapping("/modifyProduct")
	public String updateProduct(@RequestBody Product p) {
		String msg=client.updateProduct(p);
		return msg;
	}

}
