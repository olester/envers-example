package com.olester.envers.example.dao;

import com.olester.envers.example.model.ComplexDuck;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public class DuckDao extends HibernateDaoSupport implements IDuckDao {

    @Autowired
    public DuckDao(SessionFactory factory) {
        setSessionFactory(factory);
    }

    @Override
    public void updateComplexDuck(BigDecimal weight) {
        ComplexDuck complexDuck = getHibernateTemplate().get(ComplexDuck.class, 1l);
        complexDuck.setWeight(weight);
        getHibernateTemplate().update(complexDuck);
    }
}