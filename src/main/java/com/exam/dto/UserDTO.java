package com.exam.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(value = "User DTO")
public class UserDTO extends AbstractDTO {

    @ApiModelProperty(value="Id",notes = "The database generated ID",hidden = true)
    private String id;
    @ApiModelProperty(value="First Name")
    private String firstName;
    @ApiModelProperty(value="Last Name")
    private String lastName;
    @ApiModelProperty(value="Email", notes = "The email can not be null", required = true)
    private String email;
    @ApiModelProperty(value="Phone")
    private String phone;
    @ApiModelProperty(value="User Name")
    private String userName;
    @ApiModelProperty(value="Password", hidden = true)
    private String password;
    @ApiModelProperty(value="Profile")
    private String profile;
    @ApiModelProperty(value="Enabled")
    private boolean enabled = true;

    //relation ships
    List<UserRoleDTO> userRoleDTOS;
}