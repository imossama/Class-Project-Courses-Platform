package com.gestioncours.est.services;

import java.util.List;

import com.gestioncours.est.dtos.EtudiantDTO;
import com.gestioncours.est.entities.Etudiant;
import com.gestioncours.est.exceptions.FiliereNotFoundException;

public interface EtudiantService {  
      EtudiantDTO  saveEtudiant(Etudiant etudiant) throws FiliereNotFoundException;
      EtudiantDTO updateEtudiant(Etudiant etudiant);
      EtudiantDTO deleteEtudiant(Etudiant etudiant);
      List <Etudiant> getListEtudiant();
}
