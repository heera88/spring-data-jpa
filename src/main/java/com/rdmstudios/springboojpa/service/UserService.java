package com.rdmstudios.springboojpa.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.rdmstudios.springboojpa.entity.User;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserService {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(User user) {
        entityManager.persist(user);
        return user.getId();
    }
}
