package com.system.hroauth.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class User implements Serializable {

    private Long id;

    private String name;

    private String email;

    private String password;

    Set<Role> roles = new HashSet<>(); //o set é uma interface, então tem que instanciar com uma classe concreta

    public User() {}

    public User(Long id, String name, String email, String senha) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String senha) {
        this.password = senha;
    }

    public Set<Role> getRoles() {
        return roles;
    }
}
