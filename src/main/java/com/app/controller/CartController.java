package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Product;
import com.app.restcontroller.CartRestController;

@Controller
public class CartController {
	@Autowired
	private CartRestController rest;
	
	
	@RequestMapping("/show")
	public String showPage() {
		
		return "Product";
	}
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String saveData(@ModelAttribute Product p,Model m) {
		String msg=rest.saveDetails(p);
		m.addAttribute("msg", msg);
		return "Product";
	}
	
	
	@RequestMapping("/allData")
	public String getAllDetails(Model map) {
		List<Product> list=rest.getAll();
		map.addAttribute("list", list);
		return "AllData";
	}
	@RequestMapping("/update")
	public String getUpdatePage(@RequestParam Integer id,Model map) {
		Product product = rest.getByIdProduct(id);
		map.addAttribute("product", product);
		return "Update";
	}
	@RequestMapping(value = "/updated",method = RequestMethod.POST)
	public String updatedPage(@ModelAttribute Product p,Model map) {
		
		String message = rest.updateProduct(p);
		map.addAttribute("mess", message);
		return "redirect:allData";
	}
	
	
	@RequestMapping("/delete")
	public String deleteProduct(@RequestParam Integer id,Model map) {
		rest.delete(id);
		map.addAttribute("msg", "record deleted sucessfully");
		return "redirect:allData";
	}

}
