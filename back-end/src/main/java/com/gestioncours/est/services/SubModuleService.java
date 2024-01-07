package com.gestioncours.est.services;

import java.util.List;

import com.gestioncours.est.dtos.SubModuleDTO;
import com.gestioncours.est.entities.SubModule;

public interface SubModuleService {
      SubModuleDTO saveSubModule(SubModule subModule)  ;
      SubModuleDTO updateSubModule(SubModule subModule);
      void deleteSubModule(SubModuleDTO subModuleDTO);
      List <SubModule> getListSubModule();
    
} 
