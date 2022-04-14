package java8_lambda;
//functional interface
public interface Converter<P,Q>
{
public Q convert(P value);
}

