package com.gestioncours.est.services;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.gestioncours.est.dtos.FiliereDTO;
import com.gestioncours.est.entities.Filiere;
import com.gestioncours.est.entities.Module;
import com.gestioncours.est.exceptions.ModuleNotFoundException;
import com.gestioncours.est.mappers.FiliereMapper;
import com.gestioncours.est.repositories.FiliereRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class FiliereServiceIMPL implements FiliereService {
    FiliereRepository filiereRepository;
    FiliereMapper filiereMapper;
    @Override
    public FiliereDTO saveFiliere(Filiere filiere)throws ModuleNotFoundException   {
        filiere.getListModules().forEach(module -> {
          if (!(module instanceof Module)) {
               throw new ModuleNotFoundException("Module Not Found");
            }
        });

         filiereRepository.save(filiere);
         return filiereMapper.fromFiliere(filiere);
         }

    @Override
    public FiliereDTO updateFiliere(Filiere filiere) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateFiliere'");
    }

    @Override
    public FiliereDTO deleteFiliere(Filiere filiere) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteFiliere'");
    }

    @Override
    public List<Filiere> getListFiliere() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getListFiliere'");
    }

}
