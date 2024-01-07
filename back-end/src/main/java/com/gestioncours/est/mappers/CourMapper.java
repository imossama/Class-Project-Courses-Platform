package com.gestioncours.est.mappers;

import org.springframework.beans.BeanUtils;

import com.gestioncours.est.dtos.CourDTO;
import com.gestioncours.est.entities.Cour;

public class CourMapper {
    public CourDTO fromCour(Cour cour){
        CourDTO courDTO=new CourDTO();
        BeanUtils.copyProperties(cour,courDTO);
        return courDTO;
    }
    public Cour fromCourDTO(CourDTO courDTO){
        Cour cour =new Cour();
        BeanUtils.copyProperties(courDTO, cour);
        return cour;
    }
}
