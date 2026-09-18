package com.java8features;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		
		Supplier<String> supplier = ()->"Welcome to java 8";
		System.out.println(supplier.get());

	}

}
