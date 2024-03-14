package com.jobintech.controllers;

import com.jobintech.entities.Evaluation;
import com.jobintech.entities.Formateur;
import com.jobintech.services.EvaluationServive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/evaluation")
public class EvaluationController {

    @Autowired
    EvaluationServive evaluationServive;

    @GetMapping("/ajouter")
    public Evaluation save(Evaluation evaluation) {
        return evaluationServive.save(evaluation);
    }

    @GetMapping("/findById")
    public Evaluation findById(Long aLong) {
        return evaluationServive.findById(aLong);
    }

    public Iterable<Evaluation> findAll() {
        return evaluationServive.findAll();
    }

    @GetMapping("/deleteById")
    public void deleteById(Long aLong) {
        evaluationServive.deleteById(aLong);
    }

    @GetMapping("/delete")
    public void delete(Evaluation entity) {
        evaluationServive.delete(entity);
    }

    @GetMapping("/deleteAllById")
    public void deleteAllById(Iterable<? extends Long> longs) {
    }

    public void deleteAll() {
    }

    public <S extends Evaluation> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }
}
