package com.jobintech.dao;

import com.jobintech.entities.Formateur;
import com.jobintech.entities.Formateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormateurRepository extends JpaRepository<Formateur, Long> {
}
