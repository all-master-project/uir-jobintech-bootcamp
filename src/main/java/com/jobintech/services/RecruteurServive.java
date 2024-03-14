package com.jobintech.services;

import com.jobintech.dao.FormateurRepository;
import com.jobintech.dao.RecruteurRepository;
import com.jobintech.entities.Formateur;
import com.jobintech.entities.Recruteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Service
public class RecruteurServive {
    @Autowired
    RecruteurRepository recruteurRepository;

    @PostMapping("/ajouter")
    public Recruteur save(Recruteur recruteur) {
        return recruteur!=null?
                recruteurRepository.save(recruteur) :
                recruteurRepository.save(new Recruteur());
    }


    @GetMapping("/findById")
    public Recruteur findById(Long id) {
        return recruteurRepository.findById(id).get();
    }

    @GetMapping("/findById")
    public Iterable<Recruteur> findAll() {
        return recruteurRepository.findAll();
    }


    public void deleteById(Long aLong) {
        recruteurRepository.deleteById(aLong);
    }


    public void delete(Recruteur entity) {
        recruteurRepository.delete(entity);
    }


    public void deleteAllById(Iterable<? extends Long> longs) {

    }


    public void deleteAll() {

    }


    public <S extends Recruteur> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }
}
