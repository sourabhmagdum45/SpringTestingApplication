package com.example.Spring_boot_95_AllConcept.OrderData;
import org.springframework.stereotype.Service;

@Service
public class OderService {

	
	public Order getOrderService(Long id) throws OrderNotFoundException
	{
		if(id==1)
		{
			return new Order(1L,"Laptop");
		}else
		{
			throw new OrderNotFoundException("Order not found with id"+id);
		}
	}
}
