/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c2_uloha3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author Eduardo Martinez
 */
public class C2_Uloha3 {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Person");
        EntityManager em = emf.createEntityManager();
        
        //Person person = (Person) em.find(Person.class, 1);
        TypedQuery<Person> query = em.createNamedQuery("Person.findAll", Person.class);
        List<Person> results = query.getResultList();
//        if (person == null) {
//            Person milan = new Person("Milan",new Date(1997-1900,9-1,24),180,80);
//            em.getTransaction().begin();
//            em.persist(milan);
//            em.getTransaction().commit();
//        } else {
//            System.out.println("Osoba s daným menom už existuje:" + milan);
//        }
        for (int i=0;i < results.size();i++){
            System.out.println(results.get(i).getName());
            System.out.println(results.get(i).getBorn());
            System.out.println(results.get(i).getHeight());
            System.out.println(results.get(i).getWeight() + "\n");
        }

    }
}
