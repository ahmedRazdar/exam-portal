package com.exam.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(value = "Role Dto")
public class RoleDTO {

    @ApiModelProperty(value = "id", notes = "The database generated ID", hidden = true)
    private String id;
    @ApiModelProperty(value = "role")
    private String role;

    //relations
    List<UserRoleDTO> userRoleDTOS;
}
