package com.rest.examples;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/product")
public class ProductService {
	
	@POST 
	public Status  add (Product product) {
		ProductDao dao = new ProductDao();
		dao.insert(product);
		
		Status status = new Status();
		status.setMesssage("added successfully");
		return status;
	}

}
