


import java.util.List;
public class Application {

	public static void print(List<Book> books)
	{

for(Book eachBook:books)
{
	System.out.println(eachBook);
}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Book java=new Book(101,"java","suba",450);
		Book spring=new Book(102,"spring","mad",650);
		Book maven=new Book(104,"Maven","harish",550);
		Book html=new Book(107,"html","priya",1450);
  		Book python=new Book(109,"python","sathya",850);
		
CrudRepository service=new BookService();

service.add(java);
service.add(spring);
service.add(maven);
service.add(html);
service.add(python);

List<String> nameList=((BookService)service).getBookNames();
nameList.forEach(System.out::println);
//List<Book> bookList=service.findAll();
//System.out.println("greater than");
System.out.println("=================================================");
List<String> bookList=((BookService)service).getBookNamesGrtThanPrice(800);
bookList.forEach(System.out::println);
System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
List<Book> sortedByname=((BookService)service).sortedByName();
sortedByname.forEach(System.out::println);

System.out.println("------------------sorted by desc------------------");
List<Book> sortedByDesc=((BookService)service).sortedByDesc();
sortedByDesc.forEach(System.out::println);

	} 

}
