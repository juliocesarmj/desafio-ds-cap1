package com.juliomoraes.cruddscap1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.juliomoraes.cruddscap1.entities.Client;

@Repository
public interface IClientRepository extends JpaRepository<Client, Long> {

}
