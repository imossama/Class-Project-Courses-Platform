package com.gestioncours.est.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestioncours.est.entities.Filiere;

public interface FiliereRepository extends JpaRepository<Filiere,Long> {
    
}
