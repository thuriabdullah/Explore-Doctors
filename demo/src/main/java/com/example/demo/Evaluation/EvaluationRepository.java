package com.example.demo.Evaluation;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface EvaluationRepository extends JpaRepository<Evaluation,Long> {
//@Query(value="SELECT AVG(rate), DOCTORID FROM  EVALUATIONS  JOIN DOCTOR  ON EVALUATIONS.DOCTORID
}
