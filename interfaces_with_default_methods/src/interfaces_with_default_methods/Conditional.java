package interfaces_with_default_methods;


public interface Conditional<T> {

	public boolean test(T t);
	
	default boolean negate(Double value)
	{
		return value<=80.00;
	}
	
	
}
