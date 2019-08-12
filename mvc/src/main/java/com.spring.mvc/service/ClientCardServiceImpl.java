package com.spring.mvc.service;

import com.model.entities.ClientCard;
import com.spring.mvc.dao.ClientCardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClientCardServiceImpl implements ClientCardService {

    @Autowired
    private ClientCardDao clientCardDao;

    @Override
    @Transactional
    public List<ClientCard> getClientCards() {
        return clientCardDao.getClientCards();
    }

    @Override
    @Transactional
    public void saveClientCard(ClientCard clientCard) {
        clientCardDao.saveClientCard(clientCard);
    }

    @Override
    @Transactional
    public ClientCard getClientCard(String id) {
        return clientCardDao.getClientCardById(id);
    }

    @Override
    @Transactional
    public void deleteClientCard(String id) {
        clientCardDao.deleteClientCardById(id);
    }
}
