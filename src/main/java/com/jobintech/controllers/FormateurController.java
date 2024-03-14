package com.jobintech.controllers;

import com.jobintech.entities.Formateur;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/formateur")
public class FormateurController {


    @GetMapping("/ajouter")
    public Formateur save(Formateur formateur) {
        return null;
    }

    @GetMapping("/findById")
    public Optional<Formateur> findById(Long aLong) {
        return Optional.empty();
    }

    @GetMapping("/findAll")
    public List<Formateur> findAll() {
        return null;
    }

    @GetMapping("/deleteById")
    public void deleteById(Long aLong) {

    }

    @GetMapping("/delete")
    public void delete(Formateur entity) {

    }

    @GetMapping("/deleteAllById")
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @GetMapping("/deleteAll")
    public void deleteAll() {

    }

    
    public <S extends Formateur> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }
}
