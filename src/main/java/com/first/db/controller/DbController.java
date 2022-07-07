package com.first.db.controller;

import com.first.db.entity.DbEntity;
import com.first.db.repository.DbRepository;
import com.first.db.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DbController {

    @Autowired
    private DbService service;

    @Autowired
    private DbRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView listAll() {
        ModelAndView modelAndView = new ModelAndView("firstDb");

        modelAndView.addObject("repository", repository.findAll());

        return modelAndView;
    }

    @GetMapping("/post")
    public String create(DbEntity dbEntity) {
            service.create(dbEntity);
            return "redirect:/";
    }

    @GetMapping("/delete")
    public String remove() {
        service.remove();
        return "redirect:/";
    }

}
