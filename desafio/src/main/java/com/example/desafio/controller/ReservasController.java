package com.example.desafio.controller;
import com.example.desafio.model.Reservas;
import com.example.desafio.repository.ReservaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservas")
public class ReservasController {

    @Autowired
    private ReservaRepository reservaRepository;

    @GetMapping
    public List<Reservas> listar(){
        return reservaRepository.findAll();

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Reservas adicionar(@RequestBody Reservas reserva){

        return reservaRepository.save(reserva);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Long id) {
        reservaRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Reservas atualizar(@PathVariable Long id, @RequestBody Reservas reserva){
        Reservas reservaAtual = reservaRepository.findById(id).get();
        BeanUtils.copyProperties(reserva, reservaAtual, "id" );
        return reservaRepository.save(reservaAtual);
    }




}
