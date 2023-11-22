package com.siheca.authentication.response;

import com.siheca.authentication.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
public class UserResponse {

    private String id;
    private String name;

    public UserResponse(User user) {
        this.id = user.getId();
        this.name = user.getName();
    }
}
