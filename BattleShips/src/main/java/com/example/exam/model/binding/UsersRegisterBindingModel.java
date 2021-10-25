package com.example.exam.model.binding;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class UsersRegisterBindingModel {

    @Size(min = 3, max= 10)
    private String username;

    @Size(min = 5, max= 20)
    private String fullName;
    @Email
    private String email;

    @Size(min = 3)
    private String password;
    @Size(min = 3)
    private String confirmPassword;

    public UsersRegisterBindingModel() {
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

    public String getEmail() {
        return email;
    }

    public UsersRegisterBindingModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UsersRegisterBindingModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public UsersRegisterBindingModel setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }
}
