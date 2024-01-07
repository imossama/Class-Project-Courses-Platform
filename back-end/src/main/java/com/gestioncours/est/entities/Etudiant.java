package com.gestioncours.est.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data @NoArgsConstructor @AllArgsConstructor
public class Etudiant extends User{
    @ManyToOne
    private Filiere filiere;
    @ManyToOne
    private Admin admin;
}
 