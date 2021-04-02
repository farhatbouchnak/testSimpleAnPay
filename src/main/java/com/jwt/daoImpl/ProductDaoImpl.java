package com.jwt.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.dao.ProductDao;
import com.jwt.model.Marchand;
import com.jwt.model.Product;


@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory session;

	private Session getCurrentSession() {
		return session.getCurrentSession();
	}
	
	@Override
	public void addProduct(Product product) {

		getCurrentSession().save(product);
	}

	@Override
	public void updateProduct(Product product) {

		Product productToUpdate = (Product) getCurrentSession().get(Product.class, product.getId());
		productToUpdate.setCreate_date(product.getCreate_date());
		productToUpdate.setCurrency(product.getCurrency());
		productToUpdate.setHeight(product.getHeight());
		productToUpdate.setLabel(product.getLabel());
		productToUpdate.setWeight(product.getWeight());
		List<Marchand> machands = new ArrayList<Marchand>();
		for (Marchand marchand : product.getMarchands()) {
			machands.add(marchand);
		}
		productToUpdate.setMarchands(machands);
		getCurrentSession().update(productToUpdate);
	}

	@Override
	public void deleteProduct(int id) {
		Product product = (Product)getCurrentSession().get(Product.class, id);
		if(product != null)
			getCurrentSession().delete(product);
	}

}
