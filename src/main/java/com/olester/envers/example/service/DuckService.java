package com.olester.envers.example.service;

import com.olester.envers.example.dao.DuckDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: olivier
 * Date: 09/02/14
 * Time: 12:40
 * To change this template use File | Settings | File Templates.
 */
@Service
@Transactional(readOnly = true)
public class DuckService implements IDuckService{

    @Autowired
    private DuckDao duckDao;


    @Override
    public String showTables(){

        duckDao.showTables();

        return "";
    }

}
