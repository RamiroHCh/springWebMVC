package com.companyname.springapp.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companyname.springapp.business.components.ProductManagerStrategy;
import com.companyname.springapp.business.entities.Product;
import com.companyname.springapp.business.entities.enums.ProductType;

@Service
public class ProductManagerService {

	private final ProductManagerStrategy productManagerS;

	@Autowired
	public ProductManagerService(ProductManagerStrategy productManagerS) {
		this.productManagerS = productManagerS;
	}

	public List<Product> changeType(ProductType type) {
		ProductManager strategy = productManagerS.getProductManager(type);

		return strategy.getProducts();
	}

}
