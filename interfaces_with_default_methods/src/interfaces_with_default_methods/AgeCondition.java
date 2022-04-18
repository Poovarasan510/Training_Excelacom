package interfaces_with_default_methods;

public interface AgeCondition<T> {

	default boolean negate(Double age)
	{
		return age<58;
	}
}
