package com.gestioncours.est.services;

import java.util.List;

import com.gestioncours.est.dtos.EtudiantDTO;
import com.gestioncours.est.entities.Etudiant;
import com.gestioncours.est.entities.Filiere;
import com.gestioncours.est.entities.Professeur;

public interface AdminServise {
      void createListEtudiant(List <Etudiant> etudiants );
      void createListProfesseur(List <Professeur> professeurs );
      void createListFiliere(List <Filiere> filieres );
      EtudiantDTO createEtudiant(Etudiant etudiant);
      Professeur createProfesseur(Professeur professeur);


      List <Etudiant> getEtudiants();
      List <Professeur> getProfesseurs();
      List <Filiere> getFilieres();
}
