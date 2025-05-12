package com.example.demo.controller;

import com.example.demo.entity.Sales;
import com.example.demo.service.SalesService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/sales")
public class SalesController {

    private final SalesService service;

    public SalesController(SalesService service) {
        this.service = service;
    }

    @GetMapping
    public List<Sales> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Sales create(@RequestBody Sales s) {
        return service.save(s);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}