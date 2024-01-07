package com.gestioncours.est.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Admin extends User {
    private boolean IsAdmin;
    @OneToMany(mappedBy = "admin",fetch = FetchType.LAZY)
    private List <Professeur> professeurs;

    @OneToMany(mappedBy = "admin",fetch = FetchType.LAZY)
    private List <Etudiant> etudiants;
    
    @OneToMany(mappedBy = "admin",fetch = FetchType.LAZY)
    private List <Filiere> filieres;
}
