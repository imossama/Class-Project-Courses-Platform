package com.gestioncours.est.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestioncours.est.dtos.EtudiantDTO;
import com.gestioncours.est.dtos.ProfesseurDTO;
import com.gestioncours.est.entities.Admin;
import com.gestioncours.est.entities.Etudiant;
import com.gestioncours.est.entities.Filiere;
import com.gestioncours.est.entities.Professeur;
import com.gestioncours.est.mappers.ProfesseurMapper;
import com.gestioncours.est.repositories.FiliereRepository;
import com.gestioncours.est.repositories.EtudiantRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Service 
@Transactional
@AllArgsConstructor
@Slf4j

public class AdminServiceIMPL implements AdminServise{
   EtudiantServiceIMPL etudiantServiceIMPL;
    
    @Override
    public EtudiantDTO createEtudiant(Etudiant etudiant) {
       EtudiantDTO etudiantDTO=new EtudiantDTO();
       try {
            etudiantDTO=etudiantServiceIMPL.saveEtudiant(etudiant);
       } catch (Exception e) {
         e.printStackTrace();
       }
       return etudiantDTO;
     }
    @Override
    public Professeur createProfesseur(Professeur professeur) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createProfesseur'");
    }
    @Override
    public void createListEtudiant(List<Etudiant> etudiants) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createListEtudiant'");
    }
    @Override
    public void createListProfesseur(List<Professeur> professeurs) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createListProfesseur'");
    }
    @Override
    public void createListFiliere(List<Filiere> filieres) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createListFiliere'");
    }
    @Override
    public List<Etudiant> getEtudiants() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEtudiants'");
    }
    @Override
    public List<Professeur> getProfesseurs() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProfesseurs'");
    }
    @Override
    public List<Filiere> getFilieres() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFilieres'");
    }
 

    
}
