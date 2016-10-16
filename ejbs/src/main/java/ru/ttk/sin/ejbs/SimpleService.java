package ru.ttk.sin.ejbs;

import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;

/**
 * Created by 1 on 05.10.2016.
 */
@Stateless
//@WebService
public class SimpleService {
//    @PersistenceContext(unitName = "orasin")
//    private EntityManager entityManager;

//    @WebMethod
    public String getGritting(){
        return "It is a Service "+(new Date())+" <<!"+("entityManager"==null?"em is null ":" Em is not null!!");
    }
}
