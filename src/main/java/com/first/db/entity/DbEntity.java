package com.first.db.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Data
@EqualsAndHashCode
public class DbEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "password")
    private String password;

}
