package com.example.learning.jpa.basicjpa.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.example.learning.jpa.basicjpa.entity.User;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserService {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(User user){
        entityManager.persist(user);
        return user.getId();
    }
}
