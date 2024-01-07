package com.gestioncours.est.services;

import java.util.List;

import com.gestioncours.est.dtos.ModuleDTO;
import com.gestioncours.est.exceptions.ModuleNotFoundException;
import  com.gestioncours.est.entities.Module;


public interface ModuleService {
    ModuleDTO saveModule(Module module) throws ModuleNotFoundException;
    ModuleDTO updateModule(Module module);
    ModuleDTO deleteModule(Module module);
    List <Module> getListModule(); 
} 
