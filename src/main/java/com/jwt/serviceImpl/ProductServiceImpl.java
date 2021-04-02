package com.jwt.serviceImpl;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.jwt.dao.ProductDao;
import com.jwt.model.Product;
import com.jwt.service.ProductService;


@WebService(endpointInterface = "com.jwt.service.ProductService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productdao;
	
	@Override
	public void addProduct(Product product) {

		productdao.addProduct(product);
	}

	@Override
	public void updateProduct(Product product) {

		productdao.updateProduct(product);
	}

	@Override
	public void deleteProduct(int id) {

		productdao.deleteProduct(id);
	}

}
