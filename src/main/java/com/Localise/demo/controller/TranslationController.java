package com.Localise.demo.controller;

import com.Localise.demo.entities.SampleData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.Localise.demo.repositories.SampleDataRepository;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class TranslationController {

    private SampleDataRepository repository;

    @Autowired
    public TranslationController(SampleDataRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "api/sampleData", method = {RequestMethod.GET})
    public Collection<SampleData> lists() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }


    @RequestMapping(value = "api/v1/translations", method = {RequestMethod.GET})
    public String list() {
        return "Hello world";
    }

}
