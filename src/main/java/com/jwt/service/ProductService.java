package com.jwt.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.jwt.model.Product;

@WebService
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ProductService {

	@WebMethod
	public void addProduct(@WebParam(name = "product") Product product);
	@WebMethod
	public void updateProduct(@WebParam(name = "product") Product product);
	@WebMethod
	public void deleteProduct(int id);
}
