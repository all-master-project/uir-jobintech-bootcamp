package com.jobintech.services;

import com.jobintech.dao.CompetenceRepository;
import com.jobintech.dao.FormateurRepository;
import com.jobintech.entities.Competence;
import com.jobintech.entities.Formateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Service
public class CompetenceServive {
    @Autowired
    CompetenceRepository competenceRepository;

    @PostMapping("/ajouter")
    public Competence save(Competence formateur) {
        return formateur!=null?
                competenceRepository.save(formateur) :
                competenceRepository.save(new Competence());
    }


    @GetMapping("/findById")
    public Competence findById(Long id) {
        return competenceRepository.findById(id).get();
    }

    @GetMapping("/findById")
    public Iterable<Competence> findAll() {
        return competenceRepository.findAll();
    }


    public void deleteById(Long aLong) {
        competenceRepository.deleteById(aLong);
    }


    public void delete(Competence entity) {
        competenceRepository.delete(entity);
    }


    public void deleteAllById(Iterable<? extends Long> longs) {

    }


    public void deleteAll() {

    }


    public <S extends Competence> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }
}
