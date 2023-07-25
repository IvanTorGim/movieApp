package com.ivan.moviesapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name = "user")
public class UserEntity implements Serializable {

    @Id
    @Column(name = "username", length = 20)
    private String username;
    @Id
    @Column(name = "email", length = 50)
    private String email;
}
