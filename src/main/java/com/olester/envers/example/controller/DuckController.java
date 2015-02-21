package com.olester.envers.example.controller;

import com.olester.envers.example.service.IDuckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: olivier
 * Date: 09/02/14
 * Time: 17:33
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value = "/duck")
public class DuckController {

    @Autowired
    private IDuckService duckService;

    @RequestMapping(value = "showTables", method = RequestMethod.GET)
    @ResponseBody
    public String displayTables() {

        duckService.showTables();

        return "TOTO";
    }
}
