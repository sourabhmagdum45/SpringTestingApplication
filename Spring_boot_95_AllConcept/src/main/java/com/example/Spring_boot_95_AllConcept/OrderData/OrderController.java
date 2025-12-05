package com.example.Spring_boot_95_AllConcept.OrderData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders/data")
public class OrderController {
	
	@Autowired
	private OderService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<String> getOrders(@PathVariable long id)
	{
		try{
	
		Order orders=service.getOrderService(id);
		return ResponseEntity.ok("Orders Found"+orders.getOrderName());
		}
		catch(OrderNotFoundException e) {
            // Specific message for user
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                 .body("Sorry, we couldn’t find your order with ID: " + id);
        } catch (Exception e) {
            // Generic fallback message
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                                 .body("Oops! Something went wrong, please try again later.");
        }
}
}
