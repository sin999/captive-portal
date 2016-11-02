package ru.ttk.sin.ejbs;

import entities.CursOnDate;

import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Date;


@Stateless
public class SimpleService {
    @PersistenceContext(unitName = "orasin")
    private EntityManager entityManager;

    public String getGritting(){
        return "It is a Service "+(new Date())+" <<!"+(entityManager==null?"em is null ":" Em is not null!!");
    }

    public CursOnDate getCurs(Long id){
       return entityManager.find(CursOnDate.class,id);
    }


    public void addCurs(CursOnDate cursOnDate){
//        entityManager.getTransaction().begin();
//        CursOnDate cursOnDate = new CursOnDate();
//        cursOnDate.setName("Test record");

        entityManager.persist(cursOnDate);
//        entityManager.getTransaction().commit();
    }
}
