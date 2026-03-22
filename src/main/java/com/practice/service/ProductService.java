package com.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.bean.ProductReqBean;
import com.practice.entity.Products;
import com.practice.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	public List<Products> findAll() {
		List<Products> lstProducts = productRepository.findAll();
		return lstProducts;
	}

	public Products createProduct(Products product) {
		boolean validate = validateName(product.getName());
		if (validate) {
			Products createProduct = productRepository.save(product);
			return createProduct;
		} else {
			throw new RuntimeException("Invalid Name of Product");
		}

	}

	public Products updateProducts(String id, ProductReqBean products) {
		Products productFetch = productRepository.findById(id).orElse(null);
		if (productFetch != null) {
			productFetch.setName(products.getName());
			productFetch.setPid(products.getPid());
			productFetch.setQauntity(products.getQauntity());
			return productRepository.save(productFetch);
		} else {
			return null;
		}
	}

	public void deleteProduct(String id) {
		productRepository.deleteById(id);
	}

	private boolean validateName(String name) {

		return name != null && !name.isEmpty();
	}
}
