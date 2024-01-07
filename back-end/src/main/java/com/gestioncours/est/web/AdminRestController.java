package com.gestioncours.est.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestioncours.est.entities.Etudiant;
import com.gestioncours.est.services.AdminServiceIMPL;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@AllArgsConstructor
@Slf4j
public class AdminRestController {
    private AdminServiceIMPL adminServiceIMPL;
    @GetMapping("/etudiants")
    public List <Etudiant>etudiants(){
        return adminServiceIMPL.getEtudiants();
    }
}
