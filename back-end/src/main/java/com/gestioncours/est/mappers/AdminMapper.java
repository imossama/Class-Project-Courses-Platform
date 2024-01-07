package com.gestioncours.est.mappers;

import org.springframework.beans.BeanUtils;

import com.gestioncours.est.dtos.AdminDTO;
import com.gestioncours.est.entities.Admin;

public class AdminMapper {
    public Admin fromAdminDto(AdminDTO adminDTO){
        Admin admin=new Admin();
        BeanUtils.copyProperties(adminDTO,admin);
        return admin;
    }
    public AdminDTO fromAdmin(Admin admin){
        AdminDTO adminDTO=new AdminDTO();
        BeanUtils.copyProperties(admin,adminDTO);
        return adminDTO;
    }
}
