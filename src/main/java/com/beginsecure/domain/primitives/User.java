package com.beginsecure.domain.primitives;

import lombok.Data;

@Data
public class User {
    private Long id;

    private String username;

    private String password;

    private String name;

    private UserRole role;

    // Enum for user roles
    public enum UserRole {
        PATIENT, TECHNICIAN, ADMIN
    }
}