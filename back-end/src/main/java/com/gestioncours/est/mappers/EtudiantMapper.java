package com.gestioncours.est.mappers;

import org.springframework.beans.BeanUtils;

import com.gestioncours.est.dtos.EtudiantDTO;
import com.gestioncours.est.entities.Etudiant;

public class EtudiantMapper {
     public Etudiant fromEtudiantDto(EtudiantDTO etudiantDTO){
        Etudiant etudiant=new Etudiant();
        BeanUtils.copyProperties(etudiantDTO,etudiant);
        return etudiant;
    }
    public EtudiantDTO fromEtudiant(Etudiant etudiant){
        EtudiantDTO etudiantDTO=new EtudiantDTO();
        BeanUtils.copyProperties(etudiant,etudiantDTO);
        return etudiantDTO;
    }
}
