package org.glassfish.javaee7_sample;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
@Startup
public class MySessionBean {

    @PersistenceContext
    private EntityManager em;

    @PostConstruct
    public void start() {
      System.out.println(em.getMetamodel().getEntities().size());
    }

}
