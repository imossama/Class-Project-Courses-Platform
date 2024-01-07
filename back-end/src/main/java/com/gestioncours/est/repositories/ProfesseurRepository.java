package com.gestioncours.est.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestioncours.est.entities.Professeur;

public interface ProfesseurRepository extends JpaRepository<Professeur,String>{
    
}
