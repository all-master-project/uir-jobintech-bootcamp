package com.jobintech.services;

import com.jobintech.dao.FormateurRepository;
import com.jobintech.dao.PostulationRepository;
import com.jobintech.entities.Formateur;
import com.jobintech.entities.Postulation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Service
public class PostulationServive {
    @Autowired
    PostulationRepository postulationRepository;

    @PostMapping("/ajouter")
    public Postulation save(Postulation formateur) {
        return formateur!=null?
                postulationRepository.save(formateur) :
                postulationRepository.save(new Postulation());
    }


    @GetMapping("/findById")
    public Postulation findById(Long id) {
        return postulationRepository.findById(id).get();
    }

    @GetMapping("/findById")
    public Iterable<Postulation> findAll() {
        return postulationRepository.findAll();
    }

    public void deleteById(Long aLong) {
        postulationRepository.deleteById(aLong);
    }

    public void delete(Postulation entity) {
        postulationRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Long> longs) {
    }

    public void deleteAll() {

    }

    public <S extends Postulation> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }
}
