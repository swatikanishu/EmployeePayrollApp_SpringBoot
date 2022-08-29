package com.example.employeepayrollapp.repo;

import com.example.employeepayrollapp.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface Repo extends JpaRepository<Model, Long> {

    }

