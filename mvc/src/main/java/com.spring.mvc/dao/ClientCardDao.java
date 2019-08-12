package com.spring.mvc.dao;

import com.model.entities.ClientCard;

import java.util.List;

public interface ClientCardDao {

    List<ClientCard> getClientCards();

    void saveClientCard(ClientCard clientCard);

    ClientCard getClientCardById(String id);

    void deleteClientCardById(String id);

}
