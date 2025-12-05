package com.example.Spring_boot_95_AllConcept.OrderData;

public class OrderNotFoundException extends RuntimeException{

	
		public OrderNotFoundException(String message)
		{
			super(message);
		}
}
