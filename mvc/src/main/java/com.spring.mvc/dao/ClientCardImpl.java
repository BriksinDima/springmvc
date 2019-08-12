package com.spring.mvc.dao;


import com.model.entities.ClientCard;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.SessionFactory;

import java.util.List;

@Repository
public class ClientCardImpl implements ClientCardDao{


    private SessionFactory sessionFactory;

    @Autowired
    public ClientCardImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<ClientCard> getClientCards() {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<ClientCard> query = currentSession.createQuery("from ClientCard");
        List<ClientCard> clientCards = query.getResultList();
        return clientCards;
    }

    @Override
    public void saveClientCard(ClientCard clientCard) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(clientCard);

    }

    @Override
    public ClientCard getClientCardById(String id) {
        Session currentSession = sessionFactory.getCurrentSession();
        ClientCard clientCard = currentSession.get(ClientCard.class, id);
        return clientCard;
    }

    @Override
    public void deleteClientCardById(String id) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query query = currentSession.createQuery("delete from ClientCard where id =:id");
        query.setParameter("id",id);
        query.executeUpdate();
    }
}
