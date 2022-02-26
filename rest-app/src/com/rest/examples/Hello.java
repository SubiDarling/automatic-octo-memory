package com.rest.examples;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/hello")
public class Hello {
	
	@GET
	@Path("/{name}")
	public String sayHello(@PathParam("name") String name){
		return "hello" + name + "welcome";
	}

}

// when path param is used --> url should be localhost:8181/rest-app/api/hello/subhiksha
// when Query Param is used ---> url should be localhost:8181/ rest-app / api / hello / name?=Subhiksha

// without using any param then the url should be --> localhost:8181/rest-app/hello