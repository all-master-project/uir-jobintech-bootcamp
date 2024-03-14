package com.jobintech.controllers;

import com.jobintech.entities.Condidat;
import com.jobintech.entities.Formateur;
import com.jobintech.services.CandidatServive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/candidat")
public class CandidatController {

    @Autowired
    CandidatServive candidatServive;

    @PostMapping("/ajouter")
    public Condidat save(Condidat condidat) {
        return candidatServive.save(condidat);
    }

    @GetMapping("/findById")
    public Condidat findById(Long id) {
        return candidatServive.findById(id);
    }

    @GetMapping("/findAll")
    public Iterable<Condidat> findAll() {
        return candidatServive.findAll();
    }

    @DeleteMapping("/deleteById")
    public void deleteById(Long aLong) {
        candidatServive.deleteById(aLong);
    }

    @DeleteMapping("/delete")
    public void delete(Condidat entity) {
        candidatServive.delete(entity);
    }

    @DeleteMapping("/deleteAllById")
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    public void deleteAll() {

    }

    public <S extends Condidat> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }
}
