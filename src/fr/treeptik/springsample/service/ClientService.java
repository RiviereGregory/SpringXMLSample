package fr.treeptik.springsample.service;

import java.util.List;

import fr.treeptik.springsample.exception.ServiceException;
import fr.treeptik.springsample.model.Client;

public interface ClientService {

	Client save(Client client) throws ServiceException;

	void remove(Client client) throws ServiceException;

	List<Client> findAll() throws ServiceException;
	
}
