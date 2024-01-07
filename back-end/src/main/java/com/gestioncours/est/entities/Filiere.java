package com.gestioncours.est.entities;

import java.util.List;

import com.gestioncours.est.enums.Semestre;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Filiere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    
    @ElementCollection(targetClass = Semestre.class)
    @Enumerated(EnumType.STRING)
    private  Semestre Semestre;

    @OneToMany(mappedBy = "filiere", fetch = FetchType.LAZY)
    List <Module>listModules;

    @ManyToOne
    private Admin admin;
 
}
