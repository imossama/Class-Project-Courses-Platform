package com.gestioncours.est.services;

import java.util.List;

import com.gestioncours.est.dtos.CourDTO;
import com.gestioncours.est.entities.Cour;
import com.gestioncours.est.entities.Etudiant;
import com.gestioncours.est.exceptions.SubModuleNotFound;

public interface CourService {
      CourDTO saveCour(Cour cour) throws SubModuleNotFound ;
      CourDTO updateCour(Etudiant etudiant);
      void deleteCour(Etudiant etudiant);
      List <Cour> getListCour();
}
