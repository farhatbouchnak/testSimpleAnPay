package com.jwt.serviceImpl;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.jwt.dao.MarchandDao;
import com.jwt.model.Marchand;
import com.jwt.service.MarchandService;


@WebService(endpointInterface = "com.jwt.service.MarchandService")
public class MarchandServiceImpl implements MarchandService {

	@Autowired
	private MarchandDao marchandao;
	
	@Override
	public void addMarchand(Marchand marchand) {
		
		marchandao.addMarchand(marchand);
	}

	@Override
	public void updateMarchand(Marchand marchand) {
		
		marchandao.updateMarchand(marchand);
	}

	@Override
	public void deleteMarchand(int id) {
			
		marchandao.deleteMarchand(id);

	}

}
