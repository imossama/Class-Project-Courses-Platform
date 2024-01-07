package com.gestioncours.est.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestioncours.est.dtos.ModuleDTO;
import com.gestioncours.est.entities.Module;
import com.gestioncours.est.exceptions.ModuleNotFoundException;
import com.gestioncours.est.mappers.ModuleMapper;
import com.gestioncours.est.repositories.ModuleRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
@Service
@Transactional
@AllArgsConstructor
public class ModuleServiceIMPL implements ModuleService {
    ModuleMapper moduleMapper;
    ModuleRepository moduleRepository;
    @Override
    public ModuleDTO saveModule(Module module) throws ModuleNotFoundException {
       if(!(module instanceof Module)){
        throw new ModuleNotFoundException("Module Not Found");
       }
    //    moduleRepository.save(module);
       return moduleMapper.fromModule(module);
    }

    @Override
    public ModuleDTO updateModule(Module module) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateModule'");
    }

    @Override
    public ModuleDTO deleteModule(Module module) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteModule'");
    }

    @Override
    public List<Module> getListModule() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getListModule'");
    }
    
}
