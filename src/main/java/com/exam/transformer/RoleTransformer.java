package com.exam.transformer;

import com.exam.dto.RoleDTO;
import com.exam.entity.RoleEntity;

public class RoleTransformer {

    public static RoleEntity getRoleEntity(RoleDTO roleDTO){
        RoleEntity roleEntity = new RoleEntity();

        if(roleDTO.getId() != null){
            roleEntity.setId(Long.parseLong(roleDTO.getId()));
        }
        if(roleDTO.getRole() != null){
            roleEntity.setRole(roleDTO.getRole());
        }
        if(roleDTO.getUserRoleDTOS() != null){
            roleEntity.setUserRoleEntities(UserRoleTransformer.getUserRoleEntities(roleDTO.getUserRoleDTOS()));
        }
        return roleEntity;
    }

    public static RoleDTO getRoleDTO(RoleEntity roleEntity){
        RoleDTO roleDTO = new RoleDTO();

        if(roleEntity.getId() != null){
            roleDTO.setId(roleDTO.getId());
        }
        if(roleEntity.getRole() != null){
            roleDTO.setRole(roleEntity.getRole());
        }
        if(roleEntity.getUserRoleEntities() != null){
            roleDTO.setUserRoleDTOS(UserRoleTransformer.getUserRoleDTOs(roleEntity.getUserRoleEntities()));
        }

        return roleDTO;
    }
}
