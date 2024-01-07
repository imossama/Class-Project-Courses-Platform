package com.gestioncours.est.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestioncours.est.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin,String> {

    
} 