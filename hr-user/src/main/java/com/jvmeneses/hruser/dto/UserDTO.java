package com.jvmeneses.hruser.dto;

import com.jvmeneses.hruser.entities.Role;
import com.jvmeneses.hruser.entities.User;

import java.util.HashSet;
import java.util.Set;

public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private String password;
    private Set<Role> roles = new HashSet<>();

    public UserDTO() {
    }

    public UserDTO(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public UserDTO(User entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.email = entity.getEmail();
        this.password = entity.getPassword();
        this.roles = entity.getRoles();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Set<Role> getRoles() {
        return roles;
    }
}
