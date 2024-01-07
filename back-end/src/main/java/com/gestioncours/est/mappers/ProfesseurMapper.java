package com.gestioncours.est.mappers;

import org.springframework.beans.BeanUtils;

import com.gestioncours.est.dtos.ProfesseurDTO;
import com.gestioncours.est.entities.Professeur;

public class ProfesseurMapper {
    public Professeur fromProfesseurDto(ProfesseurDTO professeurDTO){
        Professeur professeur=new Professeur();
        BeanUtils.copyProperties(professeurDTO,professeur);
        return professeur;
    }
    public ProfesseurDTO fromProfesseur(Professeur professeur){
        ProfesseurDTO professeurDTO=new ProfesseurDTO();
        BeanUtils.copyProperties(professeur, professeurDTO);
        return professeurDTO;
    }
}
