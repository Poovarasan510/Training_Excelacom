package com.example.demo;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.example.demo.entity.Employee;
import com.example.demo.services.EmployeeService;

@SpringBootApplication
public class SpringDataJpaAssignmentApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx=	SpringApplication.run(SpringDataJpaAssignmentApplication.class, args);
	
	EmployeeService services=ctx.getBean(EmployeeService.class);
	
	//Employee flower=ctx.getBean(Employee.class);
	
		//Employee added=services.add(flower);
		
		//services.findAll().forEach(System.out::println);
				
					
//		List<Employee> date= services.findByDateOfBirth(LocalDate.of(2020, 04, 07));
//		date.forEach(System.out::println);
//					
//				
//	List<Employee> location = services.findByLocation("chennai");
//	location.forEach(System.out::println);
//
//	
//		List<Employee> skillSet = services.findBySkillSet("java");
//		skillSet.forEach(System.out::println);
		
		List<Employee>locationAndSkillset = services.getByLocationAndSkillset("chennai", "python");
		locationAndSkillset.forEach(System.out::println);
							
			
  		
	ctx.close();
			
			
			

		}

	
//	if(added!=null)
//	{
//		System.out.println("one employee info added");
//}
//	ctx.close();
//	}
//@Bean
//public Employee flower()
//{
//	return new Employee(102,"flower",LocalDate.of(2000, 10,10),"vellore","java");
//}
}

