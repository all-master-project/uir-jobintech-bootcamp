package com.jobintech.services;

import com.jobintech.dao.FormateurRepository;
import com.jobintech.entities.Formateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Service
public class FormateurServive {
    @Autowired
    FormateurRepository formateurRepository;

    @PostMapping("/ajouter")
    public Formateur save(Formateur formateur) {
        return formateur!=null?
                formateurRepository.save(formateur) :
                formateurRepository.save(new Formateur());
    }


    @GetMapping("/findById")
    public Formateur findById(Long id) {
        return formateurRepository.findById(id).get();
    }

    @GetMapping("/findById")
    public Iterable<Formateur> findAll() {
        return formateurRepository.findAll();
    }


    public void deleteById(Long aLong) {
        formateurRepository.deleteById(aLong);
    }


    public void delete(Formateur entity) {
        formateurRepository.delete(entity);
    }


    public void deleteAllById(Iterable<? extends Long> longs) {

    }


    public void deleteAll() {

    }


    public <S extends Formateur> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }
}
