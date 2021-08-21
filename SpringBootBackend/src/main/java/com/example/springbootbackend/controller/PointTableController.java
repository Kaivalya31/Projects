package com.example.springbootbackend.controller;

import com.example.springbootbackend.model.PointTableEntry;
import com.example.springbootbackend.repository.PointTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class PointTableController {
    @Autowired
    private PointTableRepository pointTableRepository;

    //Get all employees
    @GetMapping(path = "/pointstable")
    public List<PointTableEntry> getAllEntries() { return pointTableRepository.findAll();}
}
