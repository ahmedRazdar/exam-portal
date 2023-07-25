package com.exam.transformer;

import com.exam.dto.UserDTO;
import com.exam.dto.UserRoleDTO;
import com.exam.entity.UserEntity;
import com.exam.entity.UserRoleEntity;
import com.exam.util.DateUtil;
import java.util.List;

public class UserTransformer {

    public static UserEntity getUserEntity(UserDTO userDTO){
        UserEntity userEntity = new UserEntity();

        //common attributes
        if(userDTO.getCreatedDate() != null){
            userEntity.setCreatedDate(DateUtil.stringToDate(userDTO.getCreatedDate()));
        }
        if(userDTO.getStatus() != null){
            userEntity.setStatus(Boolean.parseBoolean(userDTO.getStatus()));
        }

        //main fields
        if(userDTO.getId() !=null){
            userEntity.setId(Long.parseLong(userDTO.getId()));
        }
        if(userDTO.getFirstName() != null){
            userEntity.setFirstName(userDTO.getFirstName());
        }
        if(userDTO.getLastName() != null){
            userEntity.setLastName(userDTO.getLastName());
        }
        if(userDTO.getEmail() != null){
            userEntity.setEmail(userDTO.getEmail());
        }
        if(userDTO.getPhone() != null){
            userEntity.setPhone(userDTO.getPhone());
        }
        if(userDTO.getUserName() != null){
            userEntity.setUserName(userDTO.getUserName());
        }
        if(userDTO.getPassword() != null){
            userEntity.setPassword(userDTO.getPassword());
        }
        if(userDTO.getProfile() != null){
            userEntity.setProfile(userDTO.getProfile());
        }
        if(userDTO.getEnabled() != null){
            userEntity.setEnabled(Boolean.parseBoolean(userDTO.getEnabled()));
        }

        //relations
        if(userDTO.getUserRoleDTOS() != null){
            List<UserRoleEntity> userRoles = UserRoleTransformer.getUserRoleEntities(userDTO.getUserRoleDTOS());
            userEntity.setUserRoleEntities(userRoles);
        }

        return userEntity;
    }

    public static UserDTO getUserDTO(UserEntity userEntity) {
        UserDTO userDTO = new UserDTO();

        //common attributes
        if(userEntity.getCreatedDate() != null){
            userDTO.setCreatedDate(DateUtil.dateToString(userEntity.getCreatedDate()));
        }
        if(userEntity.getStatus() != null){
            userDTO.setStatus(userEntity.getStatus().toString());
        }

        //main fields
        if(userEntity.getId() != null){
            userDTO.setId(userEntity.getId().toString());
        }
        if(userEntity.getEmail() != null){
            userDTO.setFirstName(userEntity.getFirstName());
        }
        if(userEntity.getLastName() != null){
            userDTO.setLastName(userEntity.getLastName());
        }
        if(userEntity.getEmail() != null){
            userDTO.setEmail(userEntity.getEmail());
        }
        if(userEntity.getPhone() != null){
            userDTO.setPhone(userEntity.getPhone());
        }
        if(userEntity.getUserName() != null){
            userDTO.setUserName(userEntity.getUserName());
        }
        if(userEntity.getPassword() != null){
            userDTO.setPassword(userEntity.getPassword());
        }
        if(userEntity.getProfile() != null){
            userDTO.setProfile(userEntity.getProfile());
        }
        userDTO.setEnabled(userDTO.getEnabled());

        //relations
        if(userEntity.getUserRoleEntities() != null){
            List<UserRoleDTO> userRoleDTOS = UserRoleTransformer.getUserRoleDTOs(userEntity.getUserRoleEntities());
            userDTO.setUserRoleDTOS(userRoleDTOS);
        }

        return userDTO;
    }
}
