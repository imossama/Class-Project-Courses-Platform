package com.gestioncours.est.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestioncours.est.dtos.EtudiantDTO;
import com.gestioncours.est.entities.Etudiant;
import com.gestioncours.est.entities.Filiere;
import com.gestioncours.est.exceptions.FiliereNotFoundException;
import com.gestioncours.est.mappers.EtudiantMapper;
import com.gestioncours.est.repositories.EtudiantRepository;
import com.gestioncours.est.repositories.FiliereRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
@Service
@Transactional
@AllArgsConstructor
public class EtudiantServiceIMPL implements EtudiantService{
    EtudiantMapper etudiantMapper;
    EtudiantRepository etudiantRepository;
    FiliereRepository filiereRepository;

    @Override
    public EtudiantDTO saveEtudiant(Etudiant etudiant) throws FiliereNotFoundException {
        Filiere filiere=filiereRepository.findById(etudiant.getFiliere().getId()).orElse(null);
        if(filiere==null)
            throw new FiliereNotFoundException("Filiere  not found");
        etudiantRepository.save(etudiant);
        EtudiantDTO etudiantDTO= etudiantMapper.fromEtudiant(etudiant);
        return etudiantDTO;
    }

    @Override
    public EtudiantDTO updateEtudiant(Etudiant etudiant) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateEtudiant'");
    }

    @Override
    public EtudiantDTO deleteEtudiant(Etudiant etudiant) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteEtudiant'");
    }

    @Override
    public List<Etudiant> getListEtudiant() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getListEtudiant'");
    }
    
}
