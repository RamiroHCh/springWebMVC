package com.companyname.springapp.business.components;

import java.util.EnumMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.companyname.springapp.business.entities.enums.ProductType;
import com.companyname.springapp.business.service.JPAProductManager;
import com.companyname.springapp.business.service.ProductManager;
import com.companyname.springapp.business.service.SimpleProductManager;

@Component
public class ProductManagerStrategy {

	private Map<ProductType, ProductManager> productManager = new EnumMap<>(ProductType.class);

	public ProductManagerStrategy() {
		initProductManager();
	}

	public ProductManager getProductManager(ProductType productType) {
		if (productType == null || !productManager.containsKey(productType)) {
			throw new IllegalArgumentException("Invalid " + productType);
		}
		
		return productManager.get(productType);
	}

	private void initProductManager() {
		productManager.put(ProductType.SIMPLETYPE, new SimpleProductManager());
		productManager.put(ProductType.JPSTYPE, new JPAProductManager());
	}

}
