package com.example.desafio.repository;

import com.example.desafio.model.Reservas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservaRepository  extends JpaRepository<Reservas,Long> {

}
