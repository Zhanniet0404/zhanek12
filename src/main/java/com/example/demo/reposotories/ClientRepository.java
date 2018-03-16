package com.example.demo.reposotories;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

import com.example.demo.models.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface ClientRepository extends CrudRepository<Client,Long> {
    Optional<Client> findById(Long id);
}
