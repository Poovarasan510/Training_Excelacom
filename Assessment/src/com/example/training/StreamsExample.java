package com.example.training;

public class StreamsExample {
	
	private String countryName;
	 private String Place;
	 private long population;
	
 public StreamsExample(String countryName, String place, long population) {
		super();
		this.countryName = countryName;
		Place = place;
		this.population = population;
	}
public StreamsExample() {
		super();
		
	}

public String getCountryName() {
	return countryName;
}
public void setCountryName(String countryName) {
	this.countryName = countryName;
}
public String getPlace() {
	return Place;
}
public void setPlace(String place) {
	Place = place;
}
public long getPopulation() {
	return population;
}
public void setPopulation(long population) {
	this.population = population;
}
@Override
public String toString() {
	return "StreamsExample [countryName=" + countryName + ", Place=" + Place + ", population=" + population + "]";
}


}