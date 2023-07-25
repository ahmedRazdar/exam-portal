package com.exam.transformer;

import com.exam.dto.UserRoleDTO;
import com.exam.entity.UserRoleEntity;
import java.util.ArrayList;
import java.util.List;

public class UserRoleTransformer {

    public static UserRoleEntity getUserRoleEntity(UserRoleDTO userRoleDTO){
        UserRoleEntity userRoleEntity = new UserRoleEntity();

        if(userRoleDTO.getId() == null){
            userRoleEntity.setId(Long.parseLong(userRoleDTO.getId()));
        }
        if(userRoleDTO.getUserDTO() == null){
            userRoleEntity.setUserEntity(UserTransformer.getUserEntity(userRoleDTO.getUserDTO()));
        }
        if(userRoleDTO.getRoleDTO() != null){
            userRoleEntity.setRoleEntity(RoleTransformer.getRoleEntity(userRoleDTO.getRoleDTO()));
        }

        return userRoleEntity;
    }

    public static UserRoleDTO getUserRoleDTO(UserRoleEntity userRoleEntity){
        UserRoleDTO userRoleDTO = new UserRoleDTO();

        if(userRoleEntity.getId() != null){
            userRoleDTO.setId(userRoleEntity.getRoleEntity().toString());
        }
        if(userRoleEntity.getUserEntity() != null){
            userRoleDTO.setUserDTO(UserTransformer.getUserDTO(userRoleEntity.getUserEntity()));
        }
        if(userRoleEntity.getRoleEntity() != null){
            userRoleDTO.setRoleDTO(RoleTransformer.getRoleDTO(userRoleEntity.getRoleEntity()));
        }

        return userRoleDTO;
    }

    public static List<UserRoleDTO> getUserRoleDTOs(List<UserRoleEntity> userRoleEntities){
        List<UserRoleDTO> userRoleDTOs = new ArrayList<>();
        for(UserRoleEntity userRoleEntity : userRoleEntities){
            UserRoleDTO userRoleDTO = UserRoleTransformer.getUserRoleDTO(userRoleEntity);
            userRoleDTOs.add(userRoleDTO);
        }
        return userRoleDTOs;
    }

    public static List<UserRoleEntity> getUserRoleEntities(List<UserRoleDTO> userRoleDTOS){
        List<UserRoleEntity> userRoleEntities = new ArrayList<>();
        for(UserRoleDTO userRoleDTO : userRoleDTOS){
            UserRoleEntity userRoleEntity = UserRoleTransformer.getUserRoleEntity(userRoleDTO);
            userRoleEntities.add(userRoleEntity);
        }
        return userRoleEntities;
    }


}
