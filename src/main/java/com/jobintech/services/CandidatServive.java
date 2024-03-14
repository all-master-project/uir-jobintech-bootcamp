package com.jobintech.services;

import com.jobintech.dao.CompetenceRepository;
import com.jobintech.dao.CondidatRepository;
import com.jobintech.dao.FormateurRepository;
import com.jobintech.entities.Competence;
import com.jobintech.entities.Condidat;
import com.jobintech.entities.Formateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Service
public class CandidatServive {
    @Autowired
    CondidatRepository condidatRepository;

    @PostMapping("/ajouter")
    public Condidat save(Condidat condidat) {
        return condidat!=null?
                condidatRepository.save(condidat) :
                condidatRepository.save(new Condidat());
    }


    @GetMapping("/findById")
    public Condidat findById(Long id) {
        return condidatRepository.findById(id).get();
    }

    @GetMapping("/findById")
    public Iterable<Condidat> findAll() {
        return condidatRepository.findAll();
    }


    public void deleteById(Long aLong) {
        condidatRepository.deleteById(aLong);
    }


    public void delete(Condidat entity) {
        condidatRepository.delete(entity);
    }


    public void deleteAllById(Iterable<? extends Long> longs) {

    }


    public void deleteAll() {

    }


    public <S extends Condidat> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }
}
