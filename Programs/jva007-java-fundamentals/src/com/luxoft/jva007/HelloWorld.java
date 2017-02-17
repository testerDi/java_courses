package com.luxoft.jva007;

import com.luxoft.jva007.presentation.MessagePrinter;

public class HelloWorld {
	
	public static void main(String[] args) {
		MessagePrinter messagePrinter = new MessagePrinter();
		System.out.println(messagePrinter.sayHello());
	}
}