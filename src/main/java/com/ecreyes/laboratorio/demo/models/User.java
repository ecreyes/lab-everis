package com.ecreyes.laboratorio.demo.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUser;

    private String username;
    private String password;

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "rol_user", joinColumns =  @JoinColumn(name ="idUser") , inverseJoinColumns = @JoinColumn(name = "idRole") )
    private Set<Role> roles = new HashSet<Role>(0);

    public User(){}

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public User(String username, String password,Set<Role> roles){
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
