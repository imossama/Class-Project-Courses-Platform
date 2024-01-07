package com.gestioncours.est.services;

import java.util.List;

import com.gestioncours.est.dtos.FiliereDTO;
import com.gestioncours.est.entities.Filiere;
import com.gestioncours.est.exceptions.ModuleNotFoundException;

public interface FiliereService {
    FiliereDTO saveFiliere(Filiere filiere) throws ModuleNotFoundException ;
    FiliereDTO updateFiliere(Filiere filiere);
    FiliereDTO deleteFiliere(Filiere filiere);
    List <Filiere> getListFiliere();

}
