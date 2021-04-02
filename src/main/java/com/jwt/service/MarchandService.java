package com.jwt.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.jwt.model.Marchand;

@WebService
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MarchandService {

	@WebMethod
	public void addMarchand(@WebParam(name = "marchand") Marchand marchand);
	@WebMethod
	public void updateMarchand(@WebParam(name = "marchand") Marchand marchand);
	@WebMethod
	public void deleteMarchand(int id);
}
