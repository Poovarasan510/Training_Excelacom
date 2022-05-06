package com.training.example.Jaxrs_client;

import jakarta.ws.rs.client.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
//import jakarta.ws.rs.client.ClientBuilder;

public class ProductClient {

	public static void main(String[] args) {
		
		
		Client client = ClientBuilder.newClient();
		
		WebTarget target = client.target("http://localhost:8080/products");
		
		Invocation.Builder builder = 
				target.request(MediaType.APPLICATION_JSON);
		
		Response resp = builder.get();
//		System.out.println(resp);
//		
//		String object = resp.readEntity(String.class);
//		System.out.println(object);
		
//		Product obj = resp.readEntity(Product.class);
//
//		System.out.println(obj);
		
//		Product toAdd = new Product(785,"oops",560);
//		
//		Response response = builder.post(Entity.entity(toAdd, MediaType.APPLICATION_JSON));
//		
//		System.out.println(response.getStatus());
//		System.out.println(response.readEntity(String.class));
		int ch=2;
		
		if(ch==4) {
			ProductService[] list = resp.readEntity(ProductService[].class);
			for(ProductService eachProduct:list) {
				System.out.println(eachProduct);
			}
		}
		if(ch==1) {
			String object = resp.readEntity(String.class);
			System.out.println(object);
		}
		if(ch==2) {
			WebTarget findByIdTarget = target.path("/srch/787");
			Invocation.Builder builder2 = 
					findByIdTarget.request(MediaType.APPLICATION_JSON);
			Response findByResp = builder2.get();
			ProductService object2 = findByResp.readEntity(ProductService.class);
			System.out.println(object2);
		}
		if(ch==3) {
			ProductService toAdd = new ProductService(785,"oops",560);
			Response response = builder.post(Entity.entity(toAdd, MediaType.APPLICATION_JSON));
			System.out.println(response.getStatus());
			System.out.println(response.readEntity(String.class));
		}
	}
	

}
