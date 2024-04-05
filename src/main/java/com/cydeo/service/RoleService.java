package com.cydeo.service;

import com.cydeo.dto.RoleDTO;
import com.cydeo.dto.UserDTO;

import java.util.List;

public interface RoleService {

    RoleDTO save(RoleDTO roleDTO);
    UserDTO findById(Long id);
    List<RoleDTO> findAll();
    void deleteById(Long id);
}
