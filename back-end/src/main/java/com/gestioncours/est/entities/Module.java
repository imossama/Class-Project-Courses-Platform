package com.gestioncours.est.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Module {
    private String name;
    @OneToMany(mappedBy = "module",fetch = FetchType.LAZY)
    List <SubModule>listSubModules;
    @ManyToOne
    private Filiere filiere;
}
