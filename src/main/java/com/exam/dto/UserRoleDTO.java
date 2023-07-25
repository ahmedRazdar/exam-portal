package com.exam.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "User_Role DTO")
public class UserRoleDTO extends AbstractDTO {

    @ApiModelProperty(value = "id", notes = "The database generated ID", hidden = true)
    private String Id;

    //relations
    private UserDTO userDTO;
    private RoleDTO roleDTO;

}
