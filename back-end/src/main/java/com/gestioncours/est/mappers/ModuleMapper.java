package com.gestioncours.est.mappers;

import org.springframework.beans.BeanUtils;

import com.gestioncours.est.dtos.ModuleDTO;
import  com.gestioncours.est.entities.Module;

public class ModuleMapper {
     public Module fromModuleDto(ModuleDTO moduleDTO){
        Module module=new Module();
        BeanUtils.copyProperties(moduleDTO,module);
        return module;
    }
    public ModuleDTO fromModule(Module module){
        ModuleDTO moduleDTO=new ModuleDTO();
        BeanUtils.copyProperties(module,moduleDTO);
        return moduleDTO;
    }
}
