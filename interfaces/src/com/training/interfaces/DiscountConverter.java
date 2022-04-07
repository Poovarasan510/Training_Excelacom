package com.training.interfaces;

public class DiscountConverter implements Conditional {

	@Override
	public boolean test(int value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean negate(int value) {
		// TODO Auto-generated method stub
		return value>1000;
	}

}
