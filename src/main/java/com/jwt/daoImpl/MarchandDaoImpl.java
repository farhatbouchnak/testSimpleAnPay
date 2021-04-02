package com.jwt.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.dao.MarchandDao;
import com.jwt.model.Marchand;
import com.jwt.model.Product;


@Repository
public class MarchandDaoImpl implements MarchandDao {

	@Autowired
	private SessionFactory session;

	private Session getCurrentSession() {
		return session.getCurrentSession();
	}

	@Override
	public void addMarchand(Marchand marchand) {

		getCurrentSession().save(marchand);
	}

	@Override
	public void updateMarchand(Marchand marchand) {

		Marchand marchandToUpdate = (Marchand) getCurrentSession().get(Marchand.class, marchand.getId());
		marchandToUpdate.setBirth_date(marchand.getBirth_date());
		marchandToUpdate.setCreate_date(marchand.getCreate_date());
		marchandToUpdate.setLast_name(marchand.getLast_name());
		marchandToUpdate.setName(marchand.getName());
		List<Product> products = new ArrayList<Product>();
		for (Product product : marchand.getProducts()) {
			products.add(product);
		}
		marchandToUpdate.setProducts(products);
		getCurrentSession().update(marchandToUpdate);
	}

	@Override
	public void deleteMarchand(int id) {

		Marchand marchand = (Marchand) getCurrentSession().get(Marchand.class, id);
		if (marchand != null)
			getCurrentSession().delete(marchand);
	}

}
