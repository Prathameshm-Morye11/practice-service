package com.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.bean.ProductReqBean;
import com.practice.entity.Products;
import com.practice.service.ProductService;

@RestController
@RequestMapping("/ProductsController")
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping("/findAll")
	public List<Products> findAll(@RequestBody ProductReqBean request) {
		List<Products> listProducts = productService.findAll();
		return listProducts;
	}

	@PostMapping("/create")
	public Products createProduct(@RequestBody ProductReqBean request) {

		Products products = new Products();
		products.setName(request.getName());
		products.setPid(request.getPid());
		products.setQauntity(request.getQauntity());
		productService.createProduct(products);
		return products;
	}

	@PostMapping("/update")
	public Products updateProducts(@RequestBody ProductReqBean request) {

		String id = request.getId();
		Products updatedProducts = productService.updateProducts(id, request);
		return updatedProducts;
	}

	@GetMapping("/delete")
	public void deleteProduct(@RequestBody ProductReqBean request) {
		productService.deleteProduct(request.getId());
	}

}
