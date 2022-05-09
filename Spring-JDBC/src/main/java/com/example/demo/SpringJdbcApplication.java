package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
ApplicationContext ctx=SpringApplication.run(SpringJdbcApplication.class, args);
	
ProductRepository repo=ctx.getBean(ProductRepository.class);

//Product tv=ctx.getBean(Product.class);
//System.out.println("Row added:"+repo.add(tv));

repo.findAll().forEach(System.out::println);

Product find=repo.findById(101);
System.out.println("Product details:"+find);

repo.delete(74);
repo.findAll().forEach(System.out::println);

Product watch=ctx.getBean(Product.class);
System.out.println("updated row watch:"+watch);

	
	}
//@Bean
//public Product tv()
//{
//	return new Product(74,"lv",8989);
//}
	
	@Bean
	public Product watch()
	{
		return new Product(32,"rolex",909);
	}
}
