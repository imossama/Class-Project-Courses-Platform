package com.gestioncours.est.services;

import java.util.List;

import com.gestioncours.est.entities.Professeur;

public interface ProfesseurService {
     //Professeur
      Professeur saveProfesseur(Professeur professeur);
      Professeur updateProfesseur(Professeur professeur);
      Professeur deleteProfesseur(Professeur professeur);
      List <Professeur> getListProfesseur();
      
}
