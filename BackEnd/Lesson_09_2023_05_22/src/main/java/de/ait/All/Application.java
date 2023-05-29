package de.ait.All;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(Application.class, args); // IoC

		// TTConnection -> "TTConnection"
		//Connection connection = (Connection) context.getBean("tcpConnection");
		//Connection connection = (Connection) context.getBean("tcp");

		//DeliveryService deliveryService = (DeliveryService) context.getBean("messageDeliveryByNet");
		//Messenger messenger = (Messenger)context.getBean("messenger");

		Messenger messenger = context.getBean(Messenger.class);
		messenger.sendMessage("hello message");
	}

}
