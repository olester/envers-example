package com.olester.envers.example.service;

import com.olester.envers.example.dao.DuckDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;


@Service
@Transactional(readOnly = false)
public class DuckService implements IDuckService{

    @Autowired
    private DuckDao duckDao;


    @Override
    public String updateComplexDuck(BigDecimal weight){

        duckDao.updateComplexDuck(weight);

        return "";
    }

}
