package com.exam.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class AbstractDTO {

    @ApiModelProperty(notes = "The application insert created date", hidden = true)
    private String createdDate;

    @ApiModelProperty(notes = "decided by application", hidden = true)
    private String status;
}
