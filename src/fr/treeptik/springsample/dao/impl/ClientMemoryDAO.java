package fr.treeptik.springsample.dao.impl;

import java.util.ArrayList;
import java.util.List;

import fr.treeptik.springsample.dao.ClientDAO;
import fr.treeptik.springsample.exception.DAOException;
import fr.treeptik.springsample.model.Client;

public class ClientMemoryDAO implements ClientDAO {

	private List<Client> clients = new ArrayList<>();

	@Override
	public Client save(Client client) throws DAOException {
		clients.add(client);
		return client;
	}

	@Override
	public void remove(Client client) throws DAOException {
		clients.remove(client);

	}

	@Override
	public List<Client> findAll() throws DAOException {
		return clients;
	}

}
