package com.exam.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AbstractDTO {

    @ApiModelProperty(notes = "The application insert created date", hidden = true)
    private String createdDate;

    @ApiModelProperty(notes = "decided by application", hidden = true)
    private String status;
}
