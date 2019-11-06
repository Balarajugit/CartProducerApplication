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
	@RequestMapping("/getPage")
	public String getPage() {
		return "GetId";
	}
	
	@RequestMapping("/deletePage")
	public String deletePage() {
		return "Delete";
	}
	
	@RequestMapping(value = "/delete",method = RequestMethod.POST)
	public String deleteById(@RequestParam Integer id,Model map) {
		rest.delete(id);
		map.addAttribute("pro", "record deleted sucessfully");
		return "Delete";
	}
	@RequestMapping(value = "getOne")
	public String getById(@RequestParam Integer id,Model map) {
		Product p=rest.getByIdProduct(id);
		map.addAttribute("pro", p);
		return "GetProduct";
	}
	@RequestMapping("/allData")
	public String getAllDetails(Model map) {
		List<Product> list=rest.getAll();
		map.addAttribute("list", list);
		return "AllData";
	}
	

}
