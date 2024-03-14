package com.jobintech.controllers;

import com.jobintech.dao.CompetenceRepository;
import com.jobintech.entities.Competence;
import com.jobintech.entities.Formateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/competence")
public class CompetenceController {

    @Autowired
    CompetenceRepository competenceRepository;

    @PostMapping("/ajouter")
    public Competence save(Competence competence) {
        return competence!=null?competenceRepository.save(competence):competenceRepository.save(new Competence());
    }


    @GetMapping("/findById")
    public Competence findById(Long id) {
        return competenceRepository.findById(id).get();
    }

    @GetMapping("/findAll")
    public Iterable<Competence> findAll() {
        return competenceRepository.findAll();
    }

    @GetMapping("/deleteById")
    public void deleteById(Long aLong) {
        competenceRepository.deleteById(aLong);
    }

    @GetMapping("/delete")
    public void delete(Competence entity) {
        competenceRepository.delete(entity);
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
