package com.jwt.dao;

import com.jwt.model.Product;

public interface ProductDao {

	public void addProduct(Product product);
	public void updateProduct(Product product);
	public void deleteProduct(int id);
}
