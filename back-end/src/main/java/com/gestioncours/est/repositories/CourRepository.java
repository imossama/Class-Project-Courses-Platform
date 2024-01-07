package com.gestioncours.est.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestioncours.est.entities.Cour;

public interface CourRepository extends JpaRepository<Cour,String> {
    
}
