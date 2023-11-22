package com.siheca.authentication.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserRequest implements Serializable {
    @ApiModelProperty(name = "user name", notes = "This is user name")
    private String name;
}
