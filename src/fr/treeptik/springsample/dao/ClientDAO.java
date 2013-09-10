package fr.treeptik.springsample.dao;

import java.util.List;

import fr.treeptik.springsample.exception.DAOException;
import fr.treeptik.springsample.model.Client;

public interface ClientDAO {

	Client save(Client client) throws DAOException;

	void remove(Client client) throws DAOException;

	List<Client> findAll() throws DAOException;

}
