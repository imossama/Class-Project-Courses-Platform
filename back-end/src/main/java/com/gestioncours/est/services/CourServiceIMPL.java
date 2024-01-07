package com.gestioncours.est.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestioncours.est.dtos.CourDTO;
import com.gestioncours.est.entities.Cour;
import com.gestioncours.est.entities.Etudiant;
import com.gestioncours.est.entities.SubModule;
import com.gestioncours.est.exceptions.SubModuleNotFound;
import com.gestioncours.est.mappers.CourMapper;
import com.gestioncours.est.repositories.CourRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class CourServiceIMPL implements CourService {
    CourMapper courMapper;
    CourRepository courRepository;

    @Override
    public CourDTO saveCour(Cour cour) throws SubModuleNotFound {
        log.info("Saving new Cour");
        if (!(cour.getSubmodule() instanceof SubModule)) {
            throw new SubModuleNotFound("La SubModule n'a pas encore été créée");
        }
        Cour savedCour = courRepository.save(cour);
        return courMapper.fromCour(savedCour);
    }

    @Override
    public CourDTO updateCour(Etudiant etudiant) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateEtudiant'");
    }

    @Override
    public void deleteCour(Etudiant etudiant) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteEtudiant'");
    }

    @Override
    public List<Cour> getListCour() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getListCour'");
    }
      
}
