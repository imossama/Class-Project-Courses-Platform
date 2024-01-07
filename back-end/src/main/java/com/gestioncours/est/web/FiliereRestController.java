package com.gestioncours.est.web;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gestioncours.est.dtos.FiliereDTO;
import com.gestioncours.est.entities.Filiere;
import com.gestioncours.est.services.FiliereServiceIMPL;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@AllArgsConstructor
@Slf4j
public class FiliereRestController {
    private FiliereServiceIMPL filiereServiceIMPL;
    @PostMapping("/createFiliere")
     public FiliereDTO createFilire(@RequestBody Filiere filiere){
        return filiereServiceIMPL.saveFiliere(filiere);
    }

}
