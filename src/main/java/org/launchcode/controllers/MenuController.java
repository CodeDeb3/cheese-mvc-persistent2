package org.launchcode.controllers;

import org.launchcode.models.data.CategoryDao;
import org.launchcode.models.data.MenuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Debbie on 4/13/2017.
 */

@Controller
@RequestMapping(value="menu")
public class MenuController {

    @Autowired
    MenuDao menuDao;

    @Autowired
    CategoryDao categoryDao;

    @RequestMapping(value ="")
    public String index(Model model) {

        model.addAttribute("title", "Menus");
        model.addAttribute("menus", menuDao.findAll());
        return "menu/index";


    }


}
