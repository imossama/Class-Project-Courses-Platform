package com.gestioncours.est.mappers;

import org.springframework.beans.BeanUtils;

import com.gestioncours.est.dtos.SubModuleDTO;
import com.gestioncours.est.entities.SubModule;

public class SubModuleMapper {
     public SubModule fromSubModuleDTO(SubModuleDTO subModuleDTO){
        SubModule subModule=new SubModule();
        BeanUtils.copyProperties(subModuleDTO,subModule);
        return subModule;
    }
    public SubModuleDTO fromSubModule(SubModule subModule){
        SubModuleDTO subModuleDTO=new SubModuleDTO();
        BeanUtils.copyProperties(subModule,subModuleDTO);
        return subModuleDTO;
    }
}
