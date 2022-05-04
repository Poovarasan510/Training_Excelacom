package java8_lambda;


public class Application {
	
	public static void print(Converter<Double,Double> conv)
	{
		System.out.println("testing:"+conv.convert(100.0));
	}
	public static void main(String args[])
	{
		Converter<Double,Double> obj=new CurrencyConverter();
		System.out.println(obj.convert(20.0));
		
		Converter<Double,Double> lambda=(val)->val*200.0;
		System.out.println(lambda.convert(20.00));
		
		print(lambda);
		
		Converter<String,Integer> strLength=str->str.length();
		System.out.println(strLength.convert("chennai"));
		
		
	}

}
