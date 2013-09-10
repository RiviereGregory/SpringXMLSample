package fr.treeptik.springsample.runtime;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.treeptik.springsample.exception.ServiceException;
import fr.treeptik.springsample.model.Client;
import fr.treeptik.springsample.service.ClientService;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		ClientService clientService = context.getBean(ClientService.class);

		Client client1 = new Client(1, "Client1", "Client1");
		Client client2 = new Client(2, "Client2", "Client2");
		Client client3 = new Client(3, "Client3", "Client3");

		try {
			clientService.save(client1);
			clientService.save(client2);
			clientService.save(client3);

			List<Client> clients = clientService.findAll();
			System.out.println("NB Client : " + clients.size());
			
			
		} catch (ServiceException e) {
			e.printStackTrace();
		}

		context.close();

	}

}
