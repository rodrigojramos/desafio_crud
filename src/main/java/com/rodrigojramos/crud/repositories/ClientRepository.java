package com.rodrigojramos.crud.repositories;

import com.rodrigojramos.crud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
