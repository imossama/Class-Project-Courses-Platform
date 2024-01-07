package com.gestioncours.est.mappers;

import org.springframework.beans.BeanUtils;

import com.gestioncours.est.dtos.FiliereDTO;
import com.gestioncours.est.entities.Filiere;

public class FiliereMapper {
    public Filiere fromFiliereDto(FiliereDTO filiereDTO){
        Filiere filiere=new Filiere();
        BeanUtils.copyProperties(filiereDTO,filiere);
        return filiere;
    }
    public FiliereDTO fromFiliere(Filiere filiere){
        FiliereDTO filiereDTO=new FiliereDTO();
        BeanUtils.copyProperties(filiere,filiereDTO);
        return filiereDTO;
    }
    
}
