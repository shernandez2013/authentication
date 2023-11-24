package com.siheca.authentication.response;

import com.siheca.authentication.entities.User;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
public class UserResponse {
    @ApiModelProperty(notes = "User id")
    private Integer id;
    @ApiModelProperty(notes = "User name")
    private String name;
    @ApiModelProperty(notes = "Last name")
    private String lastName;

    @ApiModelProperty(notes = "Last name")
    private String password;

    @ApiModelProperty(notes = "Last name")
    private String stringPassword;

    public UserResponse(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.lastName = user.getLastName();
        this.password = user.getPassword();
        this.stringPassword = user.getPassword();
    }
}
