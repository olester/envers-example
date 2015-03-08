package com.olester.envers.example.controller;

import com.olester.envers.example.service.IDuckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;

/**
 * Quack!
 */
@Controller
@RequestMapping(value = "/")
public class DuckController {

    @Autowired
    private IDuckService duckService;


    @RequestMapping(value = "/duck/update", method = RequestMethod.GET)
    @ResponseBody
    public void addNewDuck() {
        duckService.updateComplexDuck(new BigDecimal("100"));
        duckService.updateComplexDuck(new BigDecimal("100.1"));
        duckService.updateComplexDuck(new BigDecimal("100.01"));
    }
}
