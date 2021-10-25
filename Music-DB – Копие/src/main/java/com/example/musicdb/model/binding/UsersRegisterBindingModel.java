package com.example.musicdb.model.binding;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class UsersRegisterBindingModel {
    @Size(min = 3,max = 20)
    private String username;
    @Size(min = 3,max = 20)
    private String fullName;
    @Size(min = 5,max = 20)
    private String password;
    @Size(min = 5,max = 20)
    private String confirmPassword;
    @Email
    private String email;


    public UsersRegisterBindingModel() {
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public UsersRegisterBindingModel setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UsersRegisterBindingModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public UsersRegisterBindingModel setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UsersRegisterBindingModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UsersRegisterBindingModel setEmail(String email) {
        this.email = email;
        return this;
    }
}
