/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.session;

import com.example.entity.Users;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author anhquan12
 */
@Stateless
public class UsersFacade extends AbstractFacade<Users> implements UsersFacadeLocal {

    @PersistenceContext(unitName = "EnterpriseApplicationWillBeSuccess-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsersFacade() {
        super(Users.class);
    }
    
}
