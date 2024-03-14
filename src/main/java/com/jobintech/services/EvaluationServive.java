package com.jobintech.services;

import com.jobintech.dao.EvaluationRepository;
import com.jobintech.dao.FormateurRepository;
import com.jobintech.entities.Evaluation;
import com.jobintech.entities.Formateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Service
public class EvaluationServive {
    @Autowired
    EvaluationRepository evaluationRepository;

    @PostMapping("/ajouter")
    public Evaluation save(Evaluation evaluation) {
        return evaluation!=null?
                evaluationRepository.save(evaluation) :
                evaluationRepository.save(new Evaluation());
    }

    @GetMapping("/findById")
    public Evaluation findById(Long id) {
        return evaluationRepository.findById(id).get();
    }

    @GetMapping("/findById")
    public Iterable<Evaluation> findAll() {
        return evaluationRepository.findAll();
    }


    public void deleteById(Long aLong) {
        evaluationRepository.deleteById(aLong);
    }


    public void delete(Evaluation entity) {
        evaluationRepository.delete(entity);
    }


    public void deleteAllById(Iterable<? extends Long> longs) {

    }


    public void deleteAll() {

    }


    public <S extends Formateur> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }
}
