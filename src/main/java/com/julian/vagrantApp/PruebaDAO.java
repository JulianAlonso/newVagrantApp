package com.julian.vagrantApp;



import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by julianalonso on 1/12/14.
 */
@Transactional
public class PruebaDAO {

    @PersistenceContext
    private EntityManager em;

    public Long save(Prueba prueba) {
        this.em.persist(prueba);
        return prueba.getId();
    }

    public List<Prueba> getAll() {
        return this.em.createQuery("SELECT p FROM Prueba p", Prueba.class).getResultList();
    }

}
