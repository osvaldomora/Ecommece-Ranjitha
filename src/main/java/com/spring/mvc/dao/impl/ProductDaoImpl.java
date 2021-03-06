package com.spring.mvc.dao.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.mvc.dao.ProductDao;
import com.spring.mvc.model.Product;


@Repository
public class ProductDaoImpl implements ProductDao{

	List<Product> productsList = new ArrayList();
	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		Product product1 = new  Product();
		product1.setProductId(1);
		product1.setProductName("Samgung");
		product1.setProductCategory("phone");
		product1.setProductPrice(1000L);
		product1.setProductQuantity(10L);
		
		Product product2 = new  Product();
		product2.setProductId(2);
		product2.setProductName("Patito");
		product2.setProductCategory("phone");
		product2.setProductPrice(300L);
		product2.setProductQuantity(8L);
		
		Product product3 = new  Product();
		product3.setProductId(3);
		product3.setProductName("Apple");
		product3.setProductCategory("phone");
		product3.setProductPrice(300L);
		product3.setProductQuantity(8L);
		
		List<Product> productList = Arrays.asList(product1,product2,product3);
		return productList;
	}

}
