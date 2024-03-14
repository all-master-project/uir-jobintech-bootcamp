package com.jobintech.dao;

import com.jobintech.entities.Competence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetenceRepository extends CrudRepository<Competence, Long> {
}
