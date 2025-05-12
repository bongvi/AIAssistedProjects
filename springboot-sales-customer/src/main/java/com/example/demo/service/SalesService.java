package com.example.demo.service;

import com.example.demo.entity.Sales;
import com.example.demo.repository.SalesRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SalesService {
    private final SalesRepository repo;

    public SalesService(SalesRepository repo) {
        this.repo = repo;
    }

    public List<Sales> findAll() { return repo.findAll(); }
    public Sales save(Sales s) { return repo.save(s); }
    public void delete(Long id) { repo.deleteById(id); }
}