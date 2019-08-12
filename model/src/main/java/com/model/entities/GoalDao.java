package com.model.entities;

import com.model.entities.base.BaseEntity;
import com.model.entities.goals.Goal;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class GoalDao {
    public void saveStudent(BaseEntity entity) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(entity);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

}
