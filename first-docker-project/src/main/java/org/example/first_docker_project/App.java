package org.example.first_docker_project;

/**
 * Hello world!
 *
 */
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	 List<String> names = Arrays.asList("Parveen","Shannu","abc","Np");
         
         names.forEach(System.out::println);
    }
}
