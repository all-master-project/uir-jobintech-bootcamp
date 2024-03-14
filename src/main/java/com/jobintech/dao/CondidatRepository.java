package com.jobintech.dao;

import com.jobintech.entities.Condidat;
import com.jobintech.entities.Formateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CondidatRepository extends JpaRepository<Condidat, Long> {
}
