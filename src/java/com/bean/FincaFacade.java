/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import com.Finca;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author JhGomezR
 */
@Stateless
public class FincaFacade extends AbstractFacade<Finca> {
    @PersistenceContext(unitName = "AsjPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FincaFacade() {
        super(Finca.class);
    }
    
}
