package com.gestioncours.est.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestioncours.est.entities.Etudiant;

public interface EtudiantRepository  extends JpaRepository<Etudiant,String>{
    
}
