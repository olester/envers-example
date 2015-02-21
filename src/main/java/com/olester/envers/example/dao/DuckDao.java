package com.olester.envers.example.dao;

import com.olester.envers.example.model.SimpleDuck;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created with IntelliJ IDEA.
 * User: olivier
 * Date: 09/02/14
 * Time: 12:32
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class DuckDao implements IDuckDao {

    @Autowired
    SessionFactory sessionFactory;


    public String showTables(){

        SimpleDuck sd = new SimpleDuck();
        sd.setId(1);
        sd.setDuckName("coin");
        sd.setNumberOfFeather(2);

        getSession().save(sd);
        getSession().flush();

    return "";
    }

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

}
