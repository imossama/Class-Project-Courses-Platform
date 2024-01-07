package com.gestioncours.est.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestioncours.est.dtos.SubModuleDTO;
import com.gestioncours.est.entities.SubModule;
import com.gestioncours.est.mappers.SubModuleMapper;
import com.gestioncours.est.repositories.CourRepository;
import com.gestioncours.est.repositories.SubModuleRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class SubModuleServiceIMPL implements SubModuleService {
     SubModuleMapper subModuleMapper;
     SubModuleRepository subModuleRepository;
     CourRepository courRepository;
     CourService courService;
    @Override
    public SubModuleDTO saveSubModule(SubModule subModule)  {
       log.info("Saving new SubModule");
       SubModule savedModule=subModuleRepository.save(subModule);
       return subModuleMapper.fromSubModule(savedModule);
    }

    @Override
    public SubModuleDTO updateSubModule(SubModule subModule) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateSubModule'");
    }

    @Override
    public void deleteSubModule(SubModuleDTO subModuleDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteSubModule'");
    }

    @Override
    public List<SubModule> getListSubModule() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getListSubModule'");
    }
    
}
