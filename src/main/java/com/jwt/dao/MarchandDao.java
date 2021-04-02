package com.jwt.dao;

import com.jwt.model.Marchand;

public interface MarchandDao {

	public void addMarchand(Marchand product);
	public void updateMarchand(Marchand product);
	public void deleteMarchand(int id);
}
