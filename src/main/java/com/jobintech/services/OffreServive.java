package com.jobintech.services;

import com.jobintech.dao.FormateurRepository;
import com.jobintech.dao.OffreRepository;
import com.jobintech.entities.Formateur;
import com.jobintech.entities.Offre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Service
public class OffreServive {
    @Autowired
    OffreRepository offreRepository;

    @PostMapping("/ajouter")
    public Offre save(Offre formateur) {
        return formateur!=null?
                offreRepository.save(formateur) :
                offreRepository.save(new Offre());
    }


    @GetMapping("/findById")
    public Offre findById(Long id) {
        return offreRepository.findById(id).get();
    }

    @GetMapping("/findById")
    public Iterable<Offre> findAll() {
        return offreRepository.findAll();
    }


    public void deleteById(Long aLong) {
        offreRepository.deleteById(aLong);
    }


    public void delete(Offre entity) {
        offreRepository.delete(entity);
    }


    public void deleteAllById(Iterable<? extends Long> longs) {

    }


    public void deleteAll() {

    }


    public <S extends Offre> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }
}
