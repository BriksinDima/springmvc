package com.spring.mvc.service;

import com.model.entities.ClientCard;

import java.util.List;

public interface ClientCardService {
   List<ClientCard> getClientCards();
   void saveClientCard(ClientCard clientCard);
   ClientCard getClientCard(String id);
   void deleteClientCard(String id);
}
