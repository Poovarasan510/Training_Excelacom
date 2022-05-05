package com.training.product;

import java.util.List;
import java.util.Optional;

import com.training.example.jsax.Student;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/products")
public class ProductResource {
	
	private static Product service=new Product();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProductService> findAll()
	{
		return service.findAll();
	}

	@GET
	@Path("/srch/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findById(@PathParam("id") int id)
	{
		try
		{
			ProductService entity=service.findById(id)
		         .orElseThrow(()->new RuntimeException("Id not found"));
			
			return Response.ok(entity).build();
		
	}
		catch(RuntimeException e)
		{
			e.printStackTrace();
			return Response.ok("id not found").status(400).build();
		}
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	
	public Response addProduct(ProductService entity)
	{

		int result=service.addProduct(entity);
		if(result!=0) {
			return Response.ok(entity).status(201).build();
		}else {
			return Response.status(400,"Not Created").build();
		} 
	}
	
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteById(@PathParam("id")int id) {
		int result=service.deleteById(id);
		if(result!=0) {
			return Response.status(204,"One resource deleted").build();
		}else {
			return Response.status(400, "Not Deleted").build();
		}
	}
	
	@PUT
	@Path("/{productId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response updatePriceById(@PathParam("productId")  int id , ProductService product )
	{
		int result= service.updatePriceById(id,product.getPrice());
		
		if(result!=0)
		{
	 return Response.ok(product).build();
				}
				else {
				return Response.status(400,"Not updated").build();
		}
	}
	
//	@PUT
//	@Path("/{productName}/{newPrice}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response updateByName(@PathParam("productName")  String productName , @PathParam("newPrice") double newPrice)
//	{
//		int result=service.updatePriceByname(productName, newPrice);
//		return Response.ok("updated"+result+"rows").build();
//}

}
