package java8_lambda;

public class CurrencyConverter implements Converter<Double, Double> {

	@Override
	public Double convert(Double value) {
		// TODO Auto-generated method stub
		return value*100;
	}

}
