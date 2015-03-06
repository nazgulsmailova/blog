package com.epam.tb.blog.model;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class User extends BaseEntity implements Cloneable {
    String firstName;
    String lastName;
    String email;
    String password;
    Role role;
    Date registerDate;
    Date birthday;
    List<Post> posts;
    List<Comment> comments;

    public User() {}

    public User(UUID uuid) {
        super(uuid);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}
