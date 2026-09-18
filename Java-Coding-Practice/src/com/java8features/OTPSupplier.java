package com.java8features;

import java.util.function.Supplier;

public class OTPSupplier {

	public static void main(String[] args) {
		
		//Supplier interface
		Supplier<Integer> otpSupplier = ()->{
			return (int)(Math.random()*9000)+1000;
		};
		System.out.println("Generated OTP: "+otpSupplier.get());

	}

}
