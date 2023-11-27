package com.techcorp.authservice.user;

import jakarta.persistence.*;

@Table(name = "users")
@Entity
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String authToken;
    private String email;
    private String password;
}
