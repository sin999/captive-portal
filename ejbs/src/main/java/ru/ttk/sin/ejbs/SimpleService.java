package ru.ttk.sin.ejbs;

import entities.CursOnDate;

import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Date;


@Stateless
//@WebService
public class SimpleService {
    @PersistenceContext(unitName = "orasin")
    private EntityManager entityManager;

//    @WebMethod
    public String getGritting(){
        addCurs();
        return "It is a Service "+(new Date())+" <<!"+(entityManager==null?"em is null ":" Em is not null!!");
    }


    public void addCurs(){
//        entityManager.getTransaction().begin();
        CursOnDate cursOnDate = new CursOnDate();
        cursOnDate.setName("Test record");

        entityManager.persist(cursOnDate);
//        entityManager.getTransaction().commit();
    }
}
