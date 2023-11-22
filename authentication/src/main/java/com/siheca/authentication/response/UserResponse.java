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
    @ApiModelProperty(notes = "user id", example = "1", required = true)
    private Integer id;
    @ApiModelProperty(notes = "user name", example = "Joe", required = true)
    private String name;

    public UserResponse(User user) {
        this.id = user.getId();
        this.name = user.getName();
    }
}
